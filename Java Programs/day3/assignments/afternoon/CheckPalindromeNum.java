package day3.assignments.afternoon;

import java.util.Scanner;

public class CheckPalindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome:: ");
        int num = sc.nextInt(), rev = 0, temp = num;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("Given number is a PALINDROME NUMBER!!\n");
        } else {
            System.out.println("Given number is NOT a palindrome number!!\n");
        }
        sc.close();
    }
}
