import java.util.*;

//백준
public class Main {
    public int solution(PriorityQueue<Integer> pq) {
        int answer = 0;
        if (pq.size() == 1) {
            return 0;
        }
        while (pq.size() != 1) {
            int x = pq.poll();
            int y = pq.poll();
            answer += x + y;
            pq.offer(x + y);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }
        System.out.println(T.solution(pq));

    }
}
