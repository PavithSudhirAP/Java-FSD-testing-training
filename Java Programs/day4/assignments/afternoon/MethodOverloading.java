package day4.assignments.afternoon;

class GrandDad {
    String FamName = "Williams";

    void who() {
        System.out.println("I'm the GrandDad. My family name is " + FamName);
    }
}

class Dad extends GrandDad {
    void who() {
        System.out.println("I'm the DAD. My family name is " + FamName);
    }
}

class Son extends Dad {
    void who() {
        System.out.println("i'm the SON. My family name is " + FamName);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        GrandDad obj = null;
        obj = new GrandDad();
        obj.who();
        obj = new Dad();
        obj.who();
        obj = new Son();
        obj.who();
    }

}
