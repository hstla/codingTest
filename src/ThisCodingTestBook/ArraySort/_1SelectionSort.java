package ThisCodingTestBook.ArraySort;

public class _1SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i : arr) System.out.printf(i + " ");
    }
}
