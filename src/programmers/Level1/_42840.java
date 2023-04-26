package programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;

/*
모의고사
[1,2,3,4,5]
[1]

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 */
public class _42840 {
    static public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = answers.length;
        int[] an1 = {1, 2, 3, 4, 5};
        int[] an2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] an3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};

        for (int i = 0; i < n; i++) {
            if (answers[i] == an1[i % 5]) count[0]++;
            if (answers[i] == an2[i % 8]) count[1]++;
            if (answers[i] == an3[i % 10]) count[2]++;
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) answer.add(i + 1);
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2};
        for (int i : solution(arr)) System.out.println(i);
    }

}
