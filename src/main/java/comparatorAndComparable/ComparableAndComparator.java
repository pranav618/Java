package comparatorAndComparable;



//        You have a list of events, each with a name, start time, and end time. Sort the events by start time.
//        If two events have the same start time, sort them by end time.
//        If two events have the same start and end time, sort them by name.


import java.util.*;
import java.util.stream.Collectors;


class Event implements Comparable<Event>{
    private String name;
    private String startTime;
    private String endTime;
    private Integer id;

    public Event(String name, String startTime, String endTime, Integer id) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", id=" + id +
                '}';
    }
    // Comparable for sorting by start time
    @Override
    public int compareTo(Event event) {
       return this.startTime.compareTo(event.startTime);
    }
}

public class ComparableAndComparator {


    // Comparator for sorting by end time
    static Comparator<Event> eventComparator= new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {
            if(e1.getStartTime().equals(e2.getStartTime())){
                return e1.getEndTime().compareTo(e2.getEndTime());
            }
            return e1.getStartTime().compareTo(e2.getStartTime());
        }
    };

    public static void main(String[] args) {


        List<Event> events = new ArrayList<>();
        events.add(new Event("Meeting", "09:00", "10:00", 23));
        events.add(new Event("Workshop", "10:00", "12:00",35));
        events.add(new Event("Lunch", "12:00", "13:00", 367));
        events.add(new Event("Gym", "09:20", "12:00", 50));
        events.add(new Event("Presentation", "11:00", "12:00",12));
        events.add(new Event("Conference", "09:20", "11:00", 56));


//        events.sort(Comparator.comparing(Event::getName));
//        System.out.println("events: "+events.stream().map(Event::getName).collect(Collectors.joining(" ,")));
        Collections.sort(events);
        System.out.println(events);

        Collections.sort(events,eventComparator);
        System.out.println(events);    }

}
