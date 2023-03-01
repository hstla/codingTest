package ThisCodingTestBook._8Dymamicprogramming;

import java.util.Arrays;

public class _8EfficientMoney {
    public static int solution(int n, int total, int[] arr) {
        int answer;
        int[] d = new int[total + 1];
        Arrays.fill(d, 10001);
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= total; j++) {
                if (d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - arr[i] + 1]);
                }
            }
        }
        if (d[total] == 10001) answer = -1;
        else answer = d[total];
        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int total = 15;
        int[] arr = {2, 3};
        System.out.println(solution(n, total, arr));


    }
}
