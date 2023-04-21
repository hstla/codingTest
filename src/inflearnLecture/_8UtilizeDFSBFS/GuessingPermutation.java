package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;
/*
수열 추측하기
4 16
 */

public class GuessingPermutation {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void dfs(int depth, int sum) {
        if (flag) return;
        if (depth == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[depth] = i;
                    dfs(depth + 1, sum + (p[depth] * b[depth]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        GuessingPermutation T = new GuessingPermutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }
        T.dfs(0, 0);
    }
}
