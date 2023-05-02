package inflearnLecture._10dynamicProgramming;

import java.util.Scanner;

/*
계단 오르기
7
 */
public class ClimbingStairs {
    static public int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(dp[n-1]);
    }
}
