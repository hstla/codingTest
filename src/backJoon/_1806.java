package backJoon;

import java.util.Scanner;
/*
부분 합
10 15
5 1 3 5 10 7 4 9 2 8
2
 */

public class _1806 {
    public static int solution(int[] arr, int n, int s) {
        int answer = Integer.MAX_VALUE, p1 = 0, p2, sum = 0;
        for (p2 = 0; p2 < n; p2++) {
            sum += arr[p2];
            while (sum >= s) {
                answer = Math.min(p2 - p1+1, answer);
                sum -= arr[p1++];
            }
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

// chat gpt answer
//    public static int solution1(int[] arr, int n, int s) {
//        int answer = Integer.MAX_VALUE, left = 0, right = 0, sum = 0;
//        while (right < n) {
//            sum += arr[right++];
//            while (sum >= s) {
//                answer = Math.min(answer, right - left);
//                sum -= arr[left++];
//            }
//        }
//        return answer == Integer.MAX_VALUE ? 0 : answer;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(arr, n, s));
    }
}
