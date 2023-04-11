package programmers.Level2;

import java.util.*;

public class _42587 {
    static public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> q = new LinkedList<>();
        for (int i : priorities) q.add(i);
        while (!q.isEmpty()) {
            boolean check = false;
            int first = q.getFirst();
            for (int i = 1; i < q.size(); i++) {
                if (first < q.get(i)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                q.removeFirst();
                q.add(first);
                if (location == 0) location = q.size() - 1;
                else location--;
            } else {
                q.removeFirst();
                answer++;
                if (location == 0) break;
                else location--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(arr, 0));
    }
}
