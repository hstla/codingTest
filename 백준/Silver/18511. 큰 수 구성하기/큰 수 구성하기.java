import java.util.*;

public class Main {
    public static int answer;
    public static int n;
    public static int k;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        dfs(0);
        System.out.println(answer);
    }

    public static void dfs(int now) {
        if (now > n) {
            return;
        }
        if (answer < now) {
            answer = now;
        }
        for (int i = k - 1; i >= 0; i--) {
            dfs(now * 10 + arr[i]);
        }
    }
}
