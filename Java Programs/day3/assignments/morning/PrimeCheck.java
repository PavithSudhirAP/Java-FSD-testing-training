package day3.assignments.morning;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean CheckPrime(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }
        if ((num > 1) && (count == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Check if Prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = sc.nextInt();

        if (CheckPrime(a)) {
            System.out.println("It is a PRIME NUMBER.");
        } else {
            System.out.println("It is NOT a prime number.");
        }

        sc.close();

    }
}
