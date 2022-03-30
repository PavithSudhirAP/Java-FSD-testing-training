package day5.encap_demo;

import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        Student s = new Student("Domnic");
        System.out.println("Student name is " + s.getName()); // used getter method
        // change student name using setName
        Scanner sc = new Scanner(System.in);
        System.out.println("Change student name to :: ");
        String name = sc.next();
        s.setName(name); // used setter method
        System.out.println("Student name is " + s.getName()); // used getter method
        sc.close();
    }
}
