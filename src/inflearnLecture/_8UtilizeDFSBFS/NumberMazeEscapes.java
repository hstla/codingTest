package inflearnLecture._8UtilizeDFSBFS;

/*
미로 탈출 방법 개수구하기
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
 */

import java.util.Scanner;

public class NumberMazeEscapes {
    static public int answer = 0;
    static public int[] dx = {-1, 0, 1, 0};
    static public int[] dy = {0, 1, 0, -1};
    static public int[][] maze;

    public static void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1] = 1;
        dfs(1, 1);
        System.out.println(answer);
    }
}