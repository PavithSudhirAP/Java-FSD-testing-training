package day6.assignments.afternoon;

abstract class Smartphone {
    abstract void brand(); // abstract method

    abstract void price(); // abstract method

    void info() { // non-abstract method
        System.out.println("This is a smartphone");
    }
}

class Iphone extends Smartphone {
    void brand() {
        System.out.println("Apple");
    }

    void price() {
        System.out.println("70,000/-");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Smartphone p = new Iphone();
        p.brand();
        p.price();
        p.info();
    }
}
