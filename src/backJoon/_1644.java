package backJoon;

import java.util.*;

public class _1644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                int sum = 0;
                for (int j = i; j <= n; j++) {
                    if (!isPrime[j]) continue;
                    sum += j;
                    if (sum == n) {
                        cnt++;
                        break;
                    }
                    if (sum > n) {
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
