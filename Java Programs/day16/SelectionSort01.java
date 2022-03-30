package day16;

public class SelectionSort01 {

    static void printarr(String s, int[] arr) {
        System.out.print(s + " [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    static int[] sort(int[] arr) {
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
        System.out.println("--------Selection Sort--------");
        int[] numarr = { 8, 5, 7, 2, 6, 1, 4, 9, 3 };
        printarr("Original array:: ", numarr);
        printarr("Sorted array:: ", sort(numarr));
    }
}
