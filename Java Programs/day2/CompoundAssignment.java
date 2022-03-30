package day2;

import java.util.Scanner;

public class CompoundAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nums: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        a += b;
        System.out.println("Addition: " + a);
        a -= b;
        System.out.println("Subtraction: " + a);
        a *= b;
        System.out.println("Multiplication: " + a);
        a /= b;
        System.out.println("Division " + a);
        a %= b;
        System.out.println("Reminder: " + a);

        sc.close();
    }
}
