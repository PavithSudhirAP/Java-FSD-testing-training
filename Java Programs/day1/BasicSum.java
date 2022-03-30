package day1;

import java.util.Scanner;

public class BasicSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double sum = num1 + num2 + num3;
        System.out.println("Sum of your numbers = " + sum);

        sc.close();
    }

}
