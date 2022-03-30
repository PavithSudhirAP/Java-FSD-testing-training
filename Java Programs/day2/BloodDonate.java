package day2;

import java.util.Scanner;

public class BloodDonate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter Weight:");
        int weight = sc.nextInt();

        boolean pass = ((age >= 18) && (weight >= 50)) ? true : false;

        if (pass) {
            System.out.println("ELIGIBLE");
        } else {
            System.out.println("Not ELIGIBLE");
        }

        sc.close();
    }
}
