package inflearnLecture._7RecursiveTreeGraph;
// 그래프 최단거리

import java.util.*;

/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */
public class ShortestPath {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, dis;

    public void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        dis[v] = 0;
        check[v] = 0;
        while (!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : graph.get(cv)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    q.add(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        ShortestPath T = new ShortestPath();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.bfs(1);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
