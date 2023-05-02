package inflearnLecture._10dynamicProgramming;

import java.util.Scanner;

/*
최대 부분 증가수열
8
5 3 7 8 6 2 9 4
 */
public class MaximumPartialIncrementSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dp[j] > max) max = dp[j];
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
