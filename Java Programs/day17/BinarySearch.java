package day17;

public class BinarySearch {
    public static int search(int[] arr, int firstId, int lastId, int key) {
        if (lastId != firstId) {
            int midId = (lastId + firstId) / 2;
            if (arr[midId] == key) {
                return midId;
            }
            if (arr[midId] > key) {
                return search(arr, firstId, midId - 1, key);
            } else {
                return search(arr, midId + 1, lastId, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numArr = { 1, 3, 4, 5, 6, 9, 12, 25, 68, 98, 99, 103, 110, 500, 523, 564, 852, 1002, 2000, 3000 };
        int firstId = 0, lastId = (numArr.length - 1);
        int key = 69;
        int s = BinarySearch.search(numArr, firstId, lastId, key);
        System.out.println((s >= 0) ? "Element is present at index " + s + " of the array." : "Not Found!!!");

    }
}
