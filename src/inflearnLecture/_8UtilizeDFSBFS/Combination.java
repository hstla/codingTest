package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;
/*
조합 구하기
4 2

 */

public class Combination {
    static int n, m;
    static int[] combi;

    public static void dfs(int d, int s) {
        if (d == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            // i = s가 매우 중요
            for (int i = s; i <= n; i++) {
                combi[d] = i;
                dfs(d + 1, s + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        dfs(0, 1);
    }
}
