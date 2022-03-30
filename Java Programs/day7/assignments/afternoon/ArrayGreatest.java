package day7.assignments.afternoon;

import java.util.Scanner;

public class ArrayGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " intigers :: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int gr8 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            gr8 = (arr1[i] > gr8) ? arr1[i] : gr8;
        }
        System.out.println("\nGreatest element in the given array is " + gr8 + ".");
        sc.close();
    }
}
