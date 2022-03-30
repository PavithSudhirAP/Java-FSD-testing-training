package day13.assignments.afternoon;

// 3.Create two arraylist of strings to take First_name and Last_name of the students,
// and print their whole name.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListString {
    public static void main(String[] args) {
        ArrayList<String> Fst_n = new ArrayList<String>();
        ArrayList<String> Lst_n = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter First_name of student #" + i + " ::");
            Fst_n.add(sc.next());
            System.out.println("Enter Last_name of student #" + i + " ::");
            Lst_n.add(sc.next());
        }
        // Print fullname
        for (int i = 0; i < n; i++) {
            System.out.println("\nFull name of Student #" + (i + 1) + " ::" + Fst_n.get(i) + " " + Lst_n.get(i));
        }
        sc.close();
    }
}
