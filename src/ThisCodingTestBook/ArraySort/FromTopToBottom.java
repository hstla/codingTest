package ThisCodingTestBook.ArraySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FromTopToBottom {
    public static Integer[] solution(int n, Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for (int i : solution(n, arr1)) System.out.println(i);
    }
}
