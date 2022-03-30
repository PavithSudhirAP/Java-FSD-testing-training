package day1;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int a = 10, b = 19, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a = sc.nextInt();

        System.out.println("Enter the second value: ");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Sum= " + c);

        sc.close();
    }
}
