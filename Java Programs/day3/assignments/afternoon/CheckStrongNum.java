package day3.assignments.afternoon;

import java.util.Scanner;

public class CheckStrongNum {

    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt(), str = 0, temp = num;
        while (temp > 0) {
            int r = temp % 10;
            str = str + fact(r);
            temp = temp / 10;
        }
        if (str == num) {
            System.out.println("Given number is a STRONG NUMBER!!\n");
        } else {
            System.out.println("Given number is NOT a strong number!!\n");
        }
        sc.close();

    }
}
