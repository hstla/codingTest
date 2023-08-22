import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int max;
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    max = arr[i] + arr[j] + arr[k];
                    if (max <= m) {
                       answer = Math.max(max, answer);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
