package inflearnLecture._10dynamicProgramming;

import java.util.Scanner;

/*
최대점수 구하기 - 냅색 알고리즘(더 좋은 방법으로 업데이트 하는 알고리즘)
문제를 한번씩만 풀어야하니까 뒤에서 부터 반복문시작
5 20
10 5
25 12
15 8
6 3
7 4
 */
public class GetMaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();
            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        System.out.print(dy[m]);
    }
}
