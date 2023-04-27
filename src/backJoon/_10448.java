package backJoon;

import java.util.*;

public class _10448 {
    public static int[] tri;
    public static boolean check;

    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        tri = new int[44];
        tri[0] = 1;
        for (int i = 1; i < 44; i++) {
            tri[i] = tri[i - 1] + i + 1;
        }
        for (int i = 0; i < n; i++) {
            dfs(0, 0, arr[i]);
            if (check) answer[i] = 1;
            check = false;
        }
        return answer;
    }

    public static void dfs(int depth, int add, int t) {
        if (depth == 3) {
            if (add == t) check = true;
        } else {
            if (check) return;
            for (int i = 0; i < tri.length; i++) dfs(depth + 1, add + tri[i], t);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : solution(n, arr)) System.out.print(i + " ");
    }
}