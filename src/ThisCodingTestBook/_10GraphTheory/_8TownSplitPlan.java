package ThisCodingTestBook._10GraphTheory;

/*
최소 신장 트리(크루스칼 알고리즘)-도시 분할 계획
input
7 12
1 2 3
1 3 2
3 2 1
2 5 2
3 4 4
7 3 6
5 1 5
1 6 2
6 4 1
6 5 3
4 5 3
6 7 4
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EDge implements Comparable<EDge> {
    private int distance;
    private int nodeA;
    private int nodeB;

    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    public EDge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    @Override
    public int compareTo(EDge o) {
        if (this.distance < o.distance) return -1;
        return 1;
    }
}
public class _8TownSplitPlan {
    private static int v,e;
    private static int[] parent = new int[100001];
    private static ArrayList<EDge> edges = new ArrayList<>();
    public static int result = 0;

    public static int findParent(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        for (int i =1;i<=v;i++) parent[i] = i;

        for (int i = 0;i<e;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new EDge(cost, a, b));
        }
        Collections.sort(edges);
        int last = 0;

        for (int i=0;i<edges.size();i++) {
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            if (findParent(a) != findParent(b)) {
                unionParent(a,b);
                result += cost;
                last = cost;
            }
        }
        System.out.println(result - last);
    }

}
