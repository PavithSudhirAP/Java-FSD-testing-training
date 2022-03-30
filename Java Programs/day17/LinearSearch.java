package day17;

public class LinearSearch {

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numArr = { 5, 7, 2, 4, 3, 9, 8, 7, 56, 21, 45, 34, 450 };
        int key = 19;
        int s = LinearSearch.search(numArr, key);
        System.out.println((s >= 0) ? "Element is present at index " + s + " of the array." : "Not Found!!!");
    }
}
