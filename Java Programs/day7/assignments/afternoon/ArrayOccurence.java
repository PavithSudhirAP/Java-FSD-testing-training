package day7.assignments.afternoon;

import java.util.Scanner;

public class ArrayOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " intigers :: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("\nNow enter an intiger:: ");
        int newint = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == newint) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("\n" + newint + " occurs once in the given array.\n");
        } else if (count > 1) {
            System.out.println("\n" + newint + " occurs " + count + " times in the given array.\n");
        } else {
            System.out.println("\n" + newint + " DO NOT occur in the given array.\n");
        }

        sc.close();
    }
}
