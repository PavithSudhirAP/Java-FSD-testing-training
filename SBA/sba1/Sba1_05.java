package sba1;

import java.util.Scanner;

public class Sba1_05 {

	/* Write a program to take an input of a string with multiple words and
	   convert it into a string array,
	   and check if every element of that array is a Palindrome. */

	static boolean CheckPalindromeStr(String str) {
		char[] arr = str.toCharArray();
		char[] rev = new char[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--) {
			rev[j] = arr[i];
			j++;
		}

		String newStr = new String(rev);

		return str.equalsIgnoreCase(newStr);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] strArr = sentence.split(" ");
		System.out.println("\n");
		for (String s : strArr) {
			if (CheckPalindromeStr(s)) {
				System.out.println(s + " is a PALINDROME.\n");
			} else {
				System.out.println(s + " is NOT a palindrome.\n");
			}
		}
		sc.close();
	}

}
