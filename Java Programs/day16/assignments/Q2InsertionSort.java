package day16.assignments;

// Write a program to implement insertion sort.

public class Q2InsertionSort {

    static int[] insertionsort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numArr = { 5, 9, 7, 3, 6, 0, 2 };
        Q1ArraySort.printarr("Array sorted using Bubble Sort:: ", insertionsort(numArr));
    }

}
