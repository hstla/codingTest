package ThisCodingTestBook._10GraphTheory;

import java.util.Scanner;
/*
서로소 집합 사이클 확인
input
3 3
1 2
1 3
2 3
 */
public class _4DisjointSetsCycle {
    public static int v, e;
    public static int[] parent = new int[10001];

    public static int findParent(int x) {
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
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

        for (int i = 1; i <= v; i++) parent[i] = i;

        boolean cycle = false; // 사이클 발생 여부

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 사이클이 발생할 경우 종료
            if (findParent(a) == findParent(b)) {
                cycle = true;
                break;
            }
            // 사이클이 발생하지 않았다면 Union 연산 수행
            else unionParent(a, b);
        }
        if (cycle) System.out.println("사이클이 발생했습니다.");
        else System.out.println("사이클이 발생하지 않았습니다.");
    }
}
