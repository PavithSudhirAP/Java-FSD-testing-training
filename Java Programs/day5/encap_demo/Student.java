package day5.encap_demo;

public class Student {
    private String name; // instance variable

    Student(String name) { // constructor
        System.out.println("[Student class is invoked!!]");
        this.name = name;
    }

    public String getName() { // getter method
        return this.name;
    }

    public void setName(String name) { // setter method
        this.name = name;
        System.out.println("[Name change successfull!!]");
    }
}
