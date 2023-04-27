package backJoon;
import java.util.*;

class _2231 {
    public static int solution(int n) {
        if (n <= 0) return 0;
        int answer = 0;
        int sum = 0;
        while (answer <= n) {
            sum = answer;
            int tmp = answer;
            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == n) break;
            else answer++;
        }
        if (sum != n) return 0;
        else return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}