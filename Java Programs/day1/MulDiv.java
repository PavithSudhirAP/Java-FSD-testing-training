package day1;

import java.util.Scanner;

public class MulDiv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double ans = (a * b * c) / 3;
        System.out.println("Answer = " + ans);
        sc.close();
    }

}
