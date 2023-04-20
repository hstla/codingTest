package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;

/*
조합의 수  nCr = (n-1 C r-1) + (n-1 C r)
5 3
33 19
 */
public class BinomialCoefficient {
    int[][] dy = new int[35][35];
    public int dfs(int n, int r) {
        if (dy[n][r]!=0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }

    public static void main(String[] args) {
        BinomialCoefficient T = new BinomialCoefficient();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.dfs(n, r));
    }
}
