package day13.assignments.afternoon;

import java.util.ArrayList;
import java.util.Scanner;

// 2.Create a arraylist of integers and find the sum and average of the entire list.

public class ArrListIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want ::");
        int n = sc.nextInt(), sum = 0;
        double avg = 0;
        System.out.println("Enter " + n + " integer values::");
        ArrayList<Integer> ard = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            ard.add(sc.nextInt());
        }
        System.out.println("\nOriginal arraylist :: " + ard);
        // finding sum
        for (int i : ard) {
            sum += i;
        }
        System.out.println("\nSum of all elements in the arraylist = " + sum);
        // finding average
        avg = (double) sum / ard.size();
        System.out.println("\nAverage of all elements = " + avg);

        sc.close();
    }
}
