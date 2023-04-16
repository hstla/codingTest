package inflearnLecture._7RecursiveTreeGraph;

/*
피보나치 수열, 재귀보다는 for문이 더 효율이 좋다.
 */
public class _Fibonacci {
    static int[] fibo;

    public static int dfs(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 1) + dfs(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        fibo = new int[n + 1];
        dfs(n);
        for (int i = 1; i <= n; i++) System.out.printf(fibo[i] + " ");
    }
}
