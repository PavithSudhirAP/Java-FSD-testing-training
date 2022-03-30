package day4.assignments.afternoon;

public class MethodOverriding2 {
    // based on number of arguments

    static void print(int a) {
        System.out.println("ONlY " + a);
    }

    static void print(int a, int b) {
        System.out.println(a + " and " + b);
    }

    static void print(int a, int b, int c) {
        System.out.println(a + ", " + b + " and " + c);
    }

    public static void main(String[] args) {
        print(1);
        print(1, 2);
        print(1, 2, 3);
    }
}
