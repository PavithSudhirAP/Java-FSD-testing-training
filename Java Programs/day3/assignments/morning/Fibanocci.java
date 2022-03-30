package day3.assignments.morning;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers to display:: ");
        int n = sc.nextInt(), num1 = 0, num2 = 1, fib;

        System.out.print("Fibonacci series ::\n" + "0 1 ");

        for (int i = 1; i < n; i++) {
            fib = num1 + num2;
            System.out.print(fib + " ");
            num1 = num2;
            num2 = fib;
        }
        sc.close();
    }
}
