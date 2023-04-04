package programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 튜플
public class _64065 {
    static public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] arr = s.substring(2, s.length() - 2).replace("},{", "-").split("-");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        for (String q : arr) {
            String[] tmp = q.split(",");
            for (int i = 0; i < tmp.length; i++) {
                int k = Integer.parseInt(tmp[i]);
                if (!answer.contains(k)) answer.add(k);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i :solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")) System.out.println(i);
    }
}
