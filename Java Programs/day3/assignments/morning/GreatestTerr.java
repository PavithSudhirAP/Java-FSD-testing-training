package day3.assignments.morning;

import java.util.Scanner;

public class GreatestTerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nums: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int gr8 = (a > b) ? a : b;
        gr8 = (gr8 > c) ? gr8 : c;

        System.out.println("Greatest number is : " + gr8);
        sc.close();
    }

}
