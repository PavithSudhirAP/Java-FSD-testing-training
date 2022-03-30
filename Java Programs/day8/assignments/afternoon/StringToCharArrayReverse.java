package day8.assignments.afternoon;

// 3.Write a program to take input of a String and convert it into a character array and reverse the array,
// and to again make that reversed character array as a String and display it.

import java.util.Scanner;

public class StringToCharArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        char[] ch = str.toCharArray();

        char[] rev = new char[ch.length];

        for (int i = (ch.length - 1), j = 0; i >= 0; i--) {
            rev[j] = ch[i];
            j++;
        }

        String newStr = new String(rev);

        System.out.println("Reversed:: " + newStr);

        sc.close();
    }
}