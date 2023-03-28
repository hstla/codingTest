package programmers.Level2;

import java.util.Arrays;

public class _42885 {
    static public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;

        while (i < j) {
            int sum = people[i] + people[j];
            if (sum <= limit) {
                answer++;
                i++;
            } else {
                answer++;
            }
            j--;
        }
        if (i == j) answer++;


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {70, 50, 80, 50};
        System.out.println(solution(arr, 100));
    }
}
