package day1;

import java.util.Scanner;

public class AvgDouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Thress numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average value =" + avg);

        sc.close();
    }

}
