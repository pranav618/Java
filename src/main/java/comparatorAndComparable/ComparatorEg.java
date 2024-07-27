package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEg {

    static class Student{
        int age;
        String name;

        public Student(int age, String name){
            this.age = age;
            this.name=name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

    static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.age > o2.age)
                return 1;                                            // return 1 means, it will swap these 2 elements
            else
                return -1;
        }
    };

    static Comparator<Student> comparator2 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.name.length() > o2.name.length())
                return 1;                                            // return 1 means, it will swap these 2 elements
            else
                return -1;
        }
    };


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(35,"aayushi"));
        students.add(new Student(56 ,"mulick"));
        students.add(new Student(12,"pranav"));
        students.add(new Student(23,"nath"));

        Collections.sort(students, comparator);
        students.forEach(System.out::println);
    }
}
