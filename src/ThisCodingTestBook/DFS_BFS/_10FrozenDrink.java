package ThisCodingTestBook.DFS_BFS;

public class _10FrozenDrink {
    public static int n, m;
    public static int[][] graph = {
            {0,0,1,1,0},
            {0,0,0,1,1},
            {1,1,1,1,1},
            {0,0,0,0,0},
    };

    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) return false;

        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        n =4;
        m =5;
        int result = 0;
        for (int i = 0;i<n;i++) {
            for (int j = 0; j <m;j++) {
                if (dfs(i, j)) result += 1;
            }
        }
        System.out.println(result);
    }
}
