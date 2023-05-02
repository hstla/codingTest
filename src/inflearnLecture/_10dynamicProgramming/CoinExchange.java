package inflearnLecture._10dynamicProgramming;

import java.util.*;

/*
동전 교환 - 냅스 알고리즘
3
1 2 5
15
 */
public class CoinExchange {
    static public int m, n;
    static public int[] dp;

    static public int solution(int[] coin) {
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j--) {
                dp[j] = Math.min(dp[j], dp[j - coin[i] + 1]);
            }
        }
        return dp[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        dp = new int[m + 1];
        System.out.print(solution(arr));
    }
}
