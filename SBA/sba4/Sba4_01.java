package sba4;

import java.util.Scanner;

/* Write a program to take an integer array from the user and give the user a choice to sort 
using bubble sort (or) selection sort. Sort the array elements according to the selected algorithm 
of the user and display the sorted array. */

public class Sba4_01 {
	// static method to print array
	static void printarr(String s, int[] arr) {
		System.out.print(s + " [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

	// static method for bubble sort
	static int[] bubblesort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	// static method for selection sort
	static int[] selectionsort(int[] arr) {
		int len = arr.length, temp = 0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to sort?");
		int n = sc.nextInt();
		int[] numArr = new int[n];
		System.out.println("Enter " + n + " integers::");
		for (int i = 0; i < n; i++) {
			numArr[i] = sc.nextInt();
		}
		System.out.print("Choose sorting method (1-Bubble Sort, 2-Selection Sort) -->");
		int choice = sc.nextInt();
		printarr("Original array:: ", numArr);
		switch (choice) {
		case 1:
			printarr("Array sorted using Bubble Sort:: ", bubblesort(numArr));
			break;
		case 2:
			printarr("Array sorted using Selection sort:: ", selectionsort(numArr));
			break;
		default:
			System.out.println("INVALID CHOICE");
		}
		sc.close();

	}
}
