package inflearnLecture._9Greedy;

import java.util.*;

/*
원더랜드 - 프림 PriorityQueue
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15
 */
public class WonderlandPrim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n+1];
        for (int i =0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c));
        }
        int answer = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        pq.offer(new Edge(1, 0));
        while(!pq.isEmpty()) {
            Edge tmp = pq.poll();
            int ev = tmp.vex;
            if (ch[ev]==0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (Edge ob : graph.get(ev)) {
                    if (ch[ob.vex]==0) pq.offer(new Edge(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
