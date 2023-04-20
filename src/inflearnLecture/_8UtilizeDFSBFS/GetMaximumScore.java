package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;

/*
5 20
10 5
25 12
15 8
6 3
7 4
 */
public class GetMaximumScore {
    static public int n, answer = 0;
    static public int[][] arr;

    public void dfs(int time, int score, int index) {
        if (time < 0) return;
        if (index == n) {
            answer = Math.max(answer, score);
        } else {
            dfs(time - arr[index][1], score + arr[index][0], index + 1);
            dfs(time, score, index + 1);
        }
    }

    public static void main(String[] args) {
        GetMaximumScore T = new GetMaximumScore();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.dfs(m, 0, 0);
        System.out.println(answer);
    }
}
