package ThisCodingTestBook._11PreviousProblems;

import java.util.Arrays;
import java.util.Scanner;

/*
floyd-최단 경로
input
5
14
1 2 2
1 3 3
1 4 1
1 5 10
2 4 2
3 4 1
3 5 1
4 5 3
3 5 10
3 1 8
1 4 2
5 1 7
3 4 2
5 2 4
 */
public class _37FloydWarshall {
    public static final int INF = (int) 1e9;
    public static int n, m;
    public static int[][] graph = new int[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < 101; i++) Arrays.fill(graph[i], INF);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) if (i == j) graph[i][j] = 0;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (c < graph[a][b]) graph[a][b] = c;
        }

        for (int k = 1;  k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == INF) System.out.print(0 + " ");
                else System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
}
