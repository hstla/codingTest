package programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class _138476 {
    static public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] arr = new int[tangerine[tangerine.length - 1] + 1];
        for (int i : tangerine) {
            arr[i]++;
        }
        Arrays.sort(arr);
        int add = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            answer++;
            add += arr[i];
            if (add >= k) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6, arr));
    }
}