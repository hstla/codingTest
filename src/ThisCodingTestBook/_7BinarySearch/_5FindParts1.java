package ThisCodingTestBook._7BinarySearch;

import java.util.Arrays;

public class _5FindParts1 {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) return mid;
                // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
                // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid + 1;
        }
        return -1;
    }

    public static String[] solution(int n, int[] arr1, int m, int[] arr2) {
        String[] answer = new String[m];
        for (int i = 0; i < m; i++) {
            int result = binarySearch(arr1, arr2[i], 0, n - 1);
            if (result != -1) answer[i] = "yes ";
            else answer[i] = "no ";
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[] arr1 = {8, 3, 7, 9, 2};
        int[] arr2 = {5, 7, 9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (String s : solution(n, arr1, m, arr2)) System.out.println(s);
    }
}
