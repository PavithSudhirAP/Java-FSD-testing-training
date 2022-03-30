package day16;

public class Bubblesort01 {

    static void printarr(String s, int[] arr) {
        System.out.print(s + " [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

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

    public static void main(String[] args) {
        System.out.println("--------Bubble Sort--------");
        int[] numarr = { 8, 5, 7, 2, 6, 1, 4, 9, 3 };
        printarr("Original array:: ", numarr);
        printarr("Sorted array:: ", bubblesort(numarr));
    }
}
