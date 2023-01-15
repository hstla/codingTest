package programmers.Level1;


import java.util.ArrayList;

public class _12954 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = x * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        _12954 t = new _12954();
        long[] arr =t.solution(-4,2);
        for (long a : arr) {
            System.out.println(a);
        }
    }
}
