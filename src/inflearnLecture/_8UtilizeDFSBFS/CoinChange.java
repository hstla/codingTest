package inflearnLecture._8UtilizeDFSBFS;

import java.util.*;
/*
동전교환
3
1 2 5
15

5
1 8 20 25 50
129
 */

public class CoinChange {
    static public int n, m, answer = Integer.MAX_VALUE;
    static public Integer[] coin;

    static public void dfs(int count, int total) {
        if (answer <= count) return;
        if (total > m) return;
        if (total == m) {
            answer = Math.min(answer, count);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(count + 1, total + coin[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        m = sc.nextInt();

        dfs(0,  0);
        System.out.println(answer);
    }
}
