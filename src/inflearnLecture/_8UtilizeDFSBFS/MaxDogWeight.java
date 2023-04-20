package inflearnLecture._8UtilizeDFSBFS;

import java.util.*;
/*
259 5
81
58
42
33
61
 */

public class MaxDogWeight {
    public static int c, n;
    public static int answer = Integer.MIN_VALUE;
    public static int[] arr;

    public void dfs(int total, int index) {
        if (total >= c) return;
        if (index == n) {
            answer = Math.max(answer, total);
        } else {
            dfs(total + arr[index], index + 1);
            dfs(total, index + 1);
        }
    }

    public static void main(String[] args) {
        MaxDogWeight T = new MaxDogWeight();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        T.dfs(0, 0);
        System.out.println(answer);
    }
}
