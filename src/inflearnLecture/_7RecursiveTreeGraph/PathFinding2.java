package inflearnLecture._7RecursiveTreeGraph;

import java.util.ArrayList;
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
public class PathFinding2 {
    static public int n, m, answer = 0;
    static public ArrayList<ArrayList<Integer>> graph;
    static public int[] check;

    public void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (check[nv]==0) {
                    check[nv] = 1;
                    dfs(nv);
                    check[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathFinding2 T = new PathFinding2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
