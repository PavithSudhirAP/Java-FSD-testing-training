package day6.assignments.afternoon;

import java.util.Scanner;

class Student {
    private String name; // instance variable

    Student() { // constructor
        System.out.println("[Student class is invoked!!]\n");
    }

    public String getName() { // getter method
        return this.name;
    }

    public void setName(String name) { // setter method
        this.name = name;
        System.out.println("[Name change successfull!!]\n");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student(); // student class is invoked

        // change student name using setName
        System.out.print("Change student name to :: ");
        String name = sc.next();
        s.setName(name); // used setter method

        // get student name using getName
        System.out.println("Student name is " + s.getName()); // used getter method
        sc.close();
    }
}
