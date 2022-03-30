package day11;

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start of the program");
        System.out.print("100/");
        int a = sc.nextInt();
        try {
            System.out.println("= " + (100 / a));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide using zero!!");
        } finally {
            System.out.println("------[Finally block code]------");
        }
        System.out.println("End of the program");
        sc.close();
    }
}
