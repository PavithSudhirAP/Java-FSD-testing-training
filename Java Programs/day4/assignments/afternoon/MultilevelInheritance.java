package day4.assignments.afternoon;

class Car {
    void info() {
        System.out.println("I am a car!!");
    }
}

class Suzuki extends Car {
    void info() {
        System.out.println("I am a Suzuki car!!");
    }
}

class Swift extends Suzuki {
    void info() {
        System.out.println("I am Suzuki Swift!!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Car c = new Swift();
        c.info();
    }
}
