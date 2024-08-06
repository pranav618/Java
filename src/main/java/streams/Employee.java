package streams;




//Employee Data Processing:
//        Given a list of employees with attributes such as name, department, salary, and age, write a program to:
//       1.List the names of employees who are older than a age 30 and have a salary above a 85000.
//       2.Group employees by department and count the number of employees in each department.
//       3.Find the average salary of employees in each department
//       4.Find the youngest and oldest employee in the company


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employees(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}


public class Employee{

    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("John", "IT", 60000, 25),
                new Employees("Jane", "HR", 75000, 30),
                new Employees("Tom", "Finance", 80000, 45),
                new Employees("Anna", "IT", 55000, 28),
                new Employees("Mike", "Finance", 90000, 50),
                new Employees("Pranav", "IT", 820000, 55)
        );

        // Find the average salary of employees in each department
        Map<String, Double> average= employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));
        System.out.println("average salary of employees: "+ average);

        // Find the youngest and oldest employee in the company
       Employees oldest= employees.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employees::getAge))).get();
        Employees youngest= employees.stream().collect(Collectors.minBy(Comparator.comparingInt(Employees::getAge))).get();

        Optional<Employees> youngestEmployee = employees.stream().min(Comparator.comparingInt(Employees::getAge));
        Optional<Employees> oldestEmployee = employees.stream().max(Comparator.comparingInt(Employees::getAge));


        System.out.println("oldest employee: "+ oldest.toString());
        System.out.println("youngest employee: "+ youngest.toString());


        // List the names of employees who are older than a age 30 and have a salary above a 85000.
        List<Employees> employeesList =  employees.stream().filter(emp->emp.getAge()>30).filter(emp->emp.getSalary()>85000).collect(Collectors.toList());

        System.out.println("names of employees: "+ employeesList.toString());


        // Group employees by department and count the number of employees in each department

        Map<String,Long>  employeeIntegerMap = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));

        System.out.println("employees by department and count: "+ employeeIntegerMap);






    }



}



