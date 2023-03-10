package ThisCodingTestBook._10GraphTheory;

import java.util.ArrayList;
import java.util.Scanner;

/*
서로소 집합 실전문제 - 팀 결성
input
7 8
0 1 3
1 1 7
0 7 6
1 7 1
0 3 7
0 4 2
0 1 1
1 1 1
 */
public class _7MakeTeam {
    public static int n, m;
    public static int[] parent = new int[100001];

    public static int findParent(int x) {
        if (x == parent[x]) return x;
        else return findParent(parent[x]);
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int cal = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (cal == 0) unionParent(a, b);
            else if (cal == 1) {
                if (findParent(a) == findParent(b)) arr.add("YES");
                else arr.add("NO");
            }
        }
        for (String s : arr) System.out.print(s + " ");
    }
}
