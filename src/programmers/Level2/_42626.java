package programmers.Level2;

import java.util.*;

public class _42626 {
    static public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) pq.add(i);
        while (pq.peek() < K) {
            if (pq.size() == 1) return -1;
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(arr, 7));
    }
}