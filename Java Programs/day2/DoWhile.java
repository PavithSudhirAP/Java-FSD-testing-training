package day2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int n = sc.nextInt(), i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        sc.close();
    }
}
