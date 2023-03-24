package programmers.Level2;

// 최솟값 만들기 12941

import java.util.Arrays;

public class _12941 {
    static public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            int mul = A[i] * B[A.length - i - 1];
            answer += mul;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(solution(A, B));
    }
}
