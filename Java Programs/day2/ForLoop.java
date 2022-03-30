package day2;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();

        // for (int i = 0; i < 5; i++) {
        // System.out.print(i++ + " "); //post-increment
        // }

        // for (int i = 0; i < 5; i++) {
        // System.out.print(++i + " "); // pre-increment
        // }
    }

}
