package day8.assignments.afternoon;

// 4.Write a program to check for the occurance of a particular character in a string and display howmany times it has occured.
// note: take the String  and the character to be checked as a input from the user.

import java.util.Scanner;

public class CharOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        char[] str = sc.next().toCharArray();

        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : str) {
            if (c == ch) {
                count++;
            }
        }

        System.out.println(ch + " is present " + count + " times.");

        sc.close();
    }
}
