package programmers.Level2;

import java.util.Arrays;
/*
최댓값과 최솟값
 */

public class _12939 {
    public static String solution(String s) {
        String answer;
        String[] tmp = s.split("\\s");
        Integer[] arr = new Integer[tmp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < tmp.length; i++) System.out.println(arr[i]);
        answer = arr[0] + " " + arr[arr.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 -2 3 4";
        System.out.println(solution(s));
    }
}
