package inflearnLecture._9Greedy;

import java.util.*;
/*
원더랜드 - 크루스칼
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

class Edges implements Comparable<Edges> {
    int v1;
    int v2;
    int cost;

    Edges(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edges o) {
        return this.cost - o.cost;
    }
}

public class WonderlandKruskal {
    static int[] unf;
    public static int Find(int v) {
        if (v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
    public static void Union(int a,int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa!=fb) unf[fa]=unf[b];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        ArrayList<Edges> arr = new ArrayList<>();
        for (int i =0;i<=n;i++) unf[i] =i;
        for (int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edges(a,b,c));
        }
        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);
        for (Edges ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1!=fv2) {
                answer = ob.cost;
                Union(ob.v1, ob.v2);
                cnt++;
            }
            if (cnt == n-1) break;
        }
        System.out.println(answer);
    }
}
