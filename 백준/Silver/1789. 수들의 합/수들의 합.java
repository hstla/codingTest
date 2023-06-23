import java.util.*;
public class Main {
    public long solution(long S) {
        long currentSum = 0;
        long N = 0;
        while (currentSum <= S) {
            N += 1;
            currentSum += N;
        }
        return N - 1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        System.out.println(T.solution(s));
    }
}