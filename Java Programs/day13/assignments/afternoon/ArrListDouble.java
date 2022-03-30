package day13.assignments.afternoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// 1.Write a program to create an arraylist of double element and add the elements.
// sort the elements in descending order and print it.

public class ArrListDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want ::");
        int n = sc.nextInt(), sum = 0;
        System.out.println("Enter " + n + " double values::");
        ArrayList<Double> ard = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            ard.add(sc.nextDouble());
        }
        System.out.println("\nOriginal arraylist :: " + ard);

        // adding the elements
        for (Double d : ard) {
            sum += d;
        }
        System.out.println("\nSum of all elements in the arraylist = " + sum);

        // sorting the arraylist
        Collections.sort(ard, Collections.reverseOrder());
        System.out.println("\nSorted arraylist :: " + ard);
        sc.close();
    }
}
