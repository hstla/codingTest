package programmers.Level1;

import java.util.*;

public class _12906 {
    static public int[] solution(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        q.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (q.peek() != arr[i]) q.add(arr[i]);
        }
        int[] answer = new int[q.size()];
        for (int i = 0; i < q.size(); i++) {
            answer[i] = q.remove();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int i : solution(arr)) System.out.println(i);
    }
}
