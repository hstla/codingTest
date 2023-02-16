package ThisCodingTestBook.DFS_BFS;

import java.util.*;


class Node1 {
    private int x;
    private int y;

    public Node1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class _11EscapeFromTheMaze {
    public static int n = 5, m = 6;
    public static int[][] graph = {
            {1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1}
    };


    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        Queue<Node1> q = new LinkedList<>();
        q.offer(new Node1(x, y));

        while (!q.isEmpty()) {
            Node1 node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (graph[nx][ny] == 0) continue;
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node1(nx, ny));
                }
            }
        }
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        System.out.println(bfs(0, 0));
    }
}
