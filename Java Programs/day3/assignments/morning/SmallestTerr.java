package day3.assignments.morning;

import java.util.Scanner;

public class SmallestTerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nums: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int small = (a < b) ? a : b;
        small = (small < c) ? small : c;

        System.out.println("Smallest number is : " + small);
        sc.close();
    }
}
