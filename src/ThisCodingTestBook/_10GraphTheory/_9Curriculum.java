package ThisCodingTestBook._10GraphTheory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
위상 정렬 알고리즘-커리큘럼
input
5
10 -1
10 1 -1
4 1 -1
4 3 1 -1
3 3 -1
 */

public class _9Curriculum {
    public static int v;
    public static int[] indegree = new int[501];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static int[] times = new int[501];

    public static void topologySort() {
        int[] result = new int[501];
        for (int i = 1; i <= v; i++) result[i] = times[i];

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= v; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i = 0; i < graph.get(now).size(); i++) {
                result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)], result[now] + times[graph.get(now).get(i)]);
                indegree[graph.get(now).get(i)] -= 1;
                if (indegree[graph.get(now).get(i)] == 0) q.offer(graph.get(now).get(i));
            }
        }
        for (int i = 1; i <= v; i++) System.out.println(result[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();

        for (int i = 0; i <= v; i++) graph.add(new ArrayList<Integer>());

        for (int i = 1; i <= v; i++) {
            int x = sc.nextInt();
            times[i] = x;
            while (true) {
                x = sc.nextInt();
                if (x == -1) break;
                indegree[i] += 1;
                graph.get(x).add(i);
            }
        }
        topologySort();
    }


}
