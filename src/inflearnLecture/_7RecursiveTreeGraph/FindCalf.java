package inflearnLecture._7RecursiveTreeGraph;

import java.util.*;

// 송아지 찾기
public class FindCalf {
    public static int bfs(int a, int b) {
        int[] dis = {1, -1, 5};
        int depth = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[100];
        check[a] = true;
        q.add(a);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                for (int j = 0; j < 3; j++) {
                    int nextX = x + dis[j];
                    if (nextX == b) return depth + 1;
                    if (nextX >= 1 && nextX <= 100 && !check[nextX]) {
                        check[nextX] = true;
                        q.add(nextX);
                    }
                }
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        System.out.println(bfs(in1,in2));
    }
}
