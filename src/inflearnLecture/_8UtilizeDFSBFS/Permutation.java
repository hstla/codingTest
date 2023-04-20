package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;
/*
순열 구하기
3 2
3 6 9
 */

public class Permutation {
    static public int n, m;
    static public int[] check, arr, pm;

    static public void dfs(int depth) {
        if (depth == m) {
            for (int t : pm) System.out.print(t + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[depth] = arr[i];
                    dfs(depth + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        check = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
    }
}
