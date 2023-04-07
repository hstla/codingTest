package programmers.Level2;

// 연속 부분 수열 합의 개수

import java.util.HashSet;

public class _131701 {
    static public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int start = 1;
        while (start <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int value = 0;
                for (int j = i; j < i + start; j++) {
                    value += elements[j % elements.length];
                }
                set.add(value);
            }
            start++;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 1, 4};
        System.out.println(solution(arr));
    }
}
