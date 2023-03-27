package programmers.Level2;

import java.util.HashSet;
import java.util.Set;

// 영어 끝말잇기
public class _12981 {
    // 중복을 없애기 위해 set 사용
    public static Set<String> set = new HashSet<>();

    public static boolean test(String s1, String s2) {
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) return true;
        else return false;
    }

    static public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int tmp = 0;
        for (int i = 1; i < words.length; i++) {
            set.add(words[i - 1]);
            if (!test(words[i - 1], words[i]) || set.contains(words[i])) {
                tmp = i;
                break;
            }
        }
        if (tmp == 0) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        } else {
            answer[0] = (tmp % n) + 1;
            answer[1] = (tmp / n) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        for (int i : solution(2, words)) System.out.print(i + " ");
    }
}