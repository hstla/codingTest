package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;

/*
중복 순열
3 2
 */
public class PermutationRepetition {
    static public int m, n;
    static public int[] pm;


    public static void dfs(int depth) {
        if (m == depth) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[depth] = i;
                dfs(depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0);
    }
}
