package day4.assignments.afternoon;

class Flower {
    void info() {
        System.out.println("**FLOWER**");
    }
}

class Rose extends Flower {
    void color() {
        System.out.println("**RED**");
    }
}

class Jasmine extends Flower {
    void color() {
        System.out.println("**WHITE**");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Jasmine j = new Jasmine();
        j.color();

    }

}
