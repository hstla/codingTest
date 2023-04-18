package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;
/*
합이 같은 부분집합
6
1 3 5 6 7 10
 */

public class EqualSumSubset {
    static public int total, n;
    static boolean check = false;

    public void dfs(int l, int sum, int[] arr) {
        if (check) return;
        if (total / 2 < sum) return;
        if (l == n) {
            if (total - sum == sum) {
                check = true;
            }
        }
        else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        EqualSumSubset T = new EqualSumSubset();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        T.dfs(0, 0, arr);
        if (check) System.out.println("YES");
        else System.out.println("NO");
    }
}
