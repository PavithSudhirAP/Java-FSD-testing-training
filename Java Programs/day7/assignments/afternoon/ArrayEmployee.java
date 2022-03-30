package day7.assignments.afternoon;

import java.util.Scanner;

public class ArrayEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees?");
        int n = sc.nextInt();

        String[][] emp = new String[n][3];

        for (int i = 0; i < n; i++) {
            System.out.print("\nName of employee #" + (i + 1) + " ::");
            emp[i][0] = sc.next();
            System.out.print("Salary of employee #" + (i + 1) + " ::");
            emp[i][1] = sc.next();
            System.out.print("YOJ of employee #" + (i + 1) + " ::");
            emp[i][2] = sc.next();
        }

        System.out.print("\nEmployee Details: \n[ ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + emp[i][0] + ", " + emp[i][1] + ", " + emp[i][2] + "]");
            if (i != n - 1) {
                System.out.print(", ");
            } else {
                System.out.println(" ]\n");
            }
        }
        sc.close();
    }
}
