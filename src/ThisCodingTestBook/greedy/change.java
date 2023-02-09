// 거스름돈 문제 500 100 50 10
package ThisCodingTestBook.greedy;

import java.util.*;

public class change {
    public static ArrayList<Integer> solution(int money) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> charge = new ArrayList<>(Arrays.asList(500, 100, 50, 10));
        for (int i = 0; i < charge.size(); i++) {
            answer.add(money / charge.get(i));
            money %= charge.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        change T = new change();
        for (int i : T.solution(1250)) {
            System.out.println("i = " + i);
        }
    }
}
