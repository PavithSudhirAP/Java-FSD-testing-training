package day4.assignments.afternoon;

class Dog {
    void bark() {
        System.out.println("Bow...bow...bow");
    }

    void speak() {
        System.out.println("I am a Dog!!");
    }
}

class Husky extends Dog {
    void speak() {
        System.out.println("I am a Husky!!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.speak();
        h.bark();
    }
}
