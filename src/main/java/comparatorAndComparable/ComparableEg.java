package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEg {

    static class Student implements Comparable<Student>{
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

        @Override
        public int compareTo(Student that) {
            if(this.age > that.age)
                return 1;                                            // return 1 means, it will swap these 2 elements
            else
                return -1;
        }
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(35,"aayushi"));
        students.add(new Student(56 ,"mulick"));
        students.add(new Student(12,"pranav"));
        students.add(new Student(23,"nath"));


        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
