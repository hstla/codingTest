package inflearnLecture._8UtilizeDFSBFS;

import java.util.*;

/*
섬나라 아일랜드 bfs
7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0
 */
public class Ireland2 {
    static public int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static public int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static public int answer = 0, n;
    static public Queue<Point> q = new LinkedList<>();
    static public int[][] board = new int[n][n];
    static public void bfs(int x, int y) {
        q.add(new Point(x, y));
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    q.add(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    bfs(i, j);
                }
            }
        }
        System.out.println(answer);
    }
}
