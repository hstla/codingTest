package programmers.Level1;

import java.util.Scanner;

public class _87389 {
    public static int solution(int n) {
        int answer = (int) 1e9;
        int sta = 0;
        int j = n - 1;
        for (int i = 0; i < n-1; i++) {
            if (n % j == 1) sta = j;
            j -= 1;
            answer = Math.min(sta, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
