package day3.assignments.afternoon;

import java.util.Scanner;

public class CheckDuckNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:: ");
        int num = sc.nextInt();
        boolean IsDuck = false;
        while (num > 0) {
            if (num % 10 == 0) {
                IsDuck = true;
                break;
            } else {
                num = num / 10;
            }
        }
        if (IsDuck) {
            System.out.println("Given number is a DUCK NUMBER!!\n");
        } else {
            System.out.println("Given number is NOT a duck number!!\n");
        }
        sc.close();
    }

}
