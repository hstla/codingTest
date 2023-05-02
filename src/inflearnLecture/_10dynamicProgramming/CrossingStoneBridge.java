package inflearnLecture._10dynamicProgramming;

import java.util.Scanner;

/*
돌다리 건너기 - 계단오르기에서 +1해주면 됨 피보나치문제
7
 */
public class CrossingStoneBridge {
    static public int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(dp[n]);
    }
}
