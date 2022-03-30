package day3.assignments.morning;

import java.util.Scanner;

public class Arithmatics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nums: ");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble(); // take inputs
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // add
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // sub
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // mul
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // div
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // mod
        sc.close();
    }
}
