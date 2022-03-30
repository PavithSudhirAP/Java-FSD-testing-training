package day4.assignments.afternoon;

public class MethodOverriding1 {
    // based on type of argument

    static void print(int a) {
        System.out.println("int: " + a);
    }

    static void print(double a) {
        System.out.println("double: " + a);
    }

    static void print(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        print(10);
        print(1.02);
        print("APPLE");
    }
}
