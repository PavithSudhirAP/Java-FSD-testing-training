package day3.assignments.morning;

import java.util.Scanner;

public class PrimeNums extends PrimeCheck {

    public static void main(String[] args) {
        // Displays prime numbers in a given range
        Scanner sc = new Scanner(System.in);
        System.out.println("Range of prime-numbers to display:: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers till " + n + " are ::");

        for (int i = 0; i <= n; i++) {
            if (CheckPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
