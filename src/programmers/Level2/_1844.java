package programmers.Level2;

import java.util.*;
//게임 맵 최단거리

public class _1844 {
    public static int n, m;
    public static int answer = -1;
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static boolean visited[][];

    public static int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];

        return bfs(0, 0, maps);
    }

    static public int bfs(int x, int y, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 1});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int tmp[] = q.poll();
            x = tmp[0];
            y = tmp[1];
            int count = tmp[2];

            if (x == n - 1 && y == m - 1) {
                answer = count;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (maps[nx][ny] == 0) continue;
                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, count + 1});
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        System.out.println(solution(arr));

    }
}
