package day10.assignments;

import java.util.Scanner;

// 2. Write a program to implement try catch block for String Index Out of Bounds.
// import java.util.Scanner;

public class TryCatchStringIndex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start of program\nEnter a String:: ");
        String a = sc.next(); // input a string
        try {
            System.out.println(a.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
        sc.close();
    }
}
