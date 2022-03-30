package day6.assignments.afternoon;

interface Bird { // interface
    void name();

    void fly();

    void color();
}

class Chicken implements Bird {
    public void name() {
        System.out.println("This is a Chicken");
    }

    public void fly() {
        System.out.println("Chicken cannot fly");
    }

    public void color() {
        System.out.println("Can have colors white, red, black etc...");
    }
}

class Parrot implements Bird {
    public void name() {
        System.out.println("This is a Parrot");
    }

    public void fly() {
        System.out.println("Parrot can fly");
    }

    public void color() {
        System.out.println("Can have colors Green, red, yellow, blue etc...");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Bird b = null;

        b = new Chicken();
        b.name();
        b.fly();
        b.color();

        System.out.println("\n");

        b = new Parrot();
        b.name();
        b.fly();
        b.color();
    }
}
