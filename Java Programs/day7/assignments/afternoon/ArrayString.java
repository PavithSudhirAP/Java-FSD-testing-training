package day7.assignments.afternoon;

// 4.Write a program to input a String array and display it, and now to copy the elements into
// another array in the reverse order and print the reverse_array elements.

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int n = sc.nextInt();
        String[] str = new String[n], rev = new String[n];
        System.out.println("Enter " + n + " strings :: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.print("\nGiven array:: [ ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("]");

        for (int i = (str.length - 1), j = 0; i >= 0; i--) {
            rev[j] = str[i];
            j++;
        }

        System.out.print("\nReverse array:: [ ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println("]");
        sc.close();
    }
}
