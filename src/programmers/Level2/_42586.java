package programmers.Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _42586 {
    static public ArrayList<Integer> solution1(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < speeds.length; i++) {
            int count = 0;
            int add = progresses[i];
            while (100 >= add) {
                add += speeds[i];
                count++;
            }
            q.offer(count);
        }

        int sub = q.peek();
        int cnt = 0;
        while (!q.isEmpty()) {
            if (q.peek() - sub <= 0) {
                q.poll();
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 0;
                sub = q.peek();
            }
        }
        answer.add(cnt);
        return answer;
    }
    static public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < speeds.length; i++) {
            int days = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]); // 각 기능이 완료되는데 걸리는 일 수 계산
            q.offer(days);
        }

        int prev = q.poll();
        int cnt = 1;
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur <= prev) { // 이전에 계산된 날짜보다 더 오래 걸리는 기능이 없는 경우
                cnt++;
            } else { // 이전에 계산된 날짜보다 더 오래 걸리는 기능이 있는 경우
                answer.add(cnt);
                cnt = 1;
                prev = cur;
            }
        }
        answer.add(cnt); // 마지막 기능까지 함께 배포해야 하는 경우
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {93, 30, 55};
        int[] arr2 = {1, 30, 5};
        for (int i : solution(arr1, arr2)) System.out.print(i + " ");
    }
}
