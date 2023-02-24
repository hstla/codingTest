package ThisCodingTestBook.ArraySort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _12ReplaceElements {
    public static int solution(Integer[] arr1, Integer[] arr2, int k) {
        int answer = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) arr1[i] = arr2[i];
        for (int i = 0; i < arr1.length; i++) answer += arr1[i];
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        Integer[] arr1 = {1,2,5,4,3};
//        Integer[] arr2 = {5,5,6,6,5};
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            arr1[i] = j;
        }
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            arr2[i] = j;
        }
        System.out.println(solution(arr1, arr2, k));
    }
}