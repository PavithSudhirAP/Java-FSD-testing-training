package day10.assignments;

import java.util.Scanner;

// 1. Write a program to implement nested try-catch block for NUll Pointer exception
// and NumberFormat Exception.

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = " ";
        if (sc.hasNextInt()) {
            a = null;
        } else if (sc.hasNext()) {
            a = sc.next();
        }
        System.out.println("Start of program");
        try {
            a.equals("abcd");
            try {
                int b = Integer.valueOf(a);
                System.out.println(b);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
        sc.close();
    }
}