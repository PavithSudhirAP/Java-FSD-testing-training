package day8.assignments.afternoon;

// 1.Write a program to take take two strings as an input from the user and check
// if the second one is a substring of the first.

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = sc.next();
        System.out.println("Enter another string: ");
        String second = sc.next();

        if (first.indexOf(second) >= 0) {
            System.out.println(second + " is a SUBSTRING of " + first);
        } else {
            System.out.println(second + " is NOT a substring of " + first);
        }
        sc.close();
    }
}
