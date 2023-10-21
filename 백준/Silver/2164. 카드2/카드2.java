import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // input
        System.out.println(solution(n));
    }

    static public int solution(int n) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }
        while (q.size() != 1) {
            q.poll();
            q.add(q.poll());
        }
        return q.poll();
    }
}