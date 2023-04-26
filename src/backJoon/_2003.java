package backJoon;

import java.util.Scanner;

/*
수들의 합 2
10 5
1 2 3 4 2 5 3 1 1 2
3
 */
public class _2003 {
    public static int solution(int[] arr, int m) {
        int count = 0, p1 = 0, p2, sum = 0;
        for (p2 = 0 ; p2 < arr.length; p2++) {
            sum += arr[p2];
            if (sum == m) count++;
            while (sum >= m) {
                sum -= arr[p1++];
                if (sum == m) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(arr, m));
    }
}
