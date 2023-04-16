package inflearnLecture._7RecursiveTreeGraph;

import java.util.Scanner;

/*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 */

public class PathFinding1 {
    static int answer = 0;
    static int n = 5;
    static int m = 9;
    static int[][] graph;
    static int[] check;

    public void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        PathFinding1 T = new PathFinding1();
        Scanner sc = new Scanner(System.in);
        graph = new int[n + 1][n + 1];
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
