package day7.assignments.afternoon;

import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int n = sc.nextInt();
        boolean dup = false;
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " intigers :: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("\nDuplicate elements:: ");
        outer: for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.print(arr1[i] + "  ");
                    dup = true;
                    continue outer;
                }
            }
        }
        if (!dup) {
            System.out.println("NONE");
        }
        sc.close();
    }
}
