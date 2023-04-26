package programmers.Level2;

import java.util.*;

public class _42746 {
    static public String solution(Integer[] numbers) {
        String answer = "";
//        Arrays.sort(numbers, Collections.reverseOrder());
        ArrayList<String> arr = new ArrayList<>();
        for (int i : numbers) {
            arr.add(String.valueOf(i));
        }
        Collections.sort(arr, Collections.reverseOrder());
//        for (String s : arr) System.out.println(s);
        for (String s : arr) {
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args) {
        // 9534330
        Integer[] arr = {3, 30, 34, 5, 9};
        System.out.println(solution(arr));
    }
}
