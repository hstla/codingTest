package ThisCodingTestBook._11PreviousProblems;

import java.util.Scanner;

public class SpecificNumCounts {
    public static int lowerBound(int[] arr, int start, int target, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static int upperBound(int[] arr, int start, int target, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        int rightIndex = upperBound(arr, 0, rightValue, arr.length);
        int leftIndex = lowerBound(arr, 0, leftValue, arr.length);
        return rightIndex - leftIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int cnt = countByRange(arr, target, target);

        if (cnt == 0) System.out.println(-1);
        else System.out.println(cnt);
    }
}