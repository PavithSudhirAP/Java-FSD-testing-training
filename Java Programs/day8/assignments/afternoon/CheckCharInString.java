package day8.assignments.afternoon;

// 2.Write a program to take input of a String and also take in a number of characters as the
// user wishes and check if they are present in the String.

import java.util.Scanner;

public class CheckCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = sc.next();
        System.out.println("How many chars to check? ::");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " characters :: ");

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            if (first.contains(Character.toString(c))) {
                System.out.println(c + " is PRESENT in " + first);
            } else {
                System.out.println(c + " is NOT present in " + first);
            }
        }

        sc.close();

    }
}
