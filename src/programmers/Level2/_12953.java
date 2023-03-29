package programmers.Level2;

import java.util.*;
// N개의 최소공배수

public class _12953 {
    static public boolean remainderZero(int[] arr, int answer) {
        for (int i : arr) {
            if (answer % i != 0) return false;
        }
        return true;
    }
    static public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];
        while (true) {
            if (remainderZero(arr, answer) == true) {
                return answer;
            } else answer++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }
}
