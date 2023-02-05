package _2ArrayTest;
//에라토스테네스체가 소수찾는데 제일 빠르다.
import java.util.Scanner;

public class _17PrimeNum {
    public int solution(int num) {
        int answer = 0;
        int[] ch = new int[num + 1];
        for (int i = 2; i < num; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = 0; j <= num; j += i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        _17PrimeNum T = new _17PrimeNum();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(T.solution(num));
    }
}
