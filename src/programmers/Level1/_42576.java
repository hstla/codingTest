package programmers.Level1;
import java.util.*;
public class _42576 {
    static public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap();
        for (int i =0;i<participant.length;i++) {

            if (map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) + 1);
            } else map.put(participant[i],1);
        }
        for (int i =0;i<completion.length;i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) == 1) return s;
        }
        return " ";
    }
    public static void main(String[] args) {
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"eden", "kiki"};
        System.out.println(solution(arr1,arr2));
    }
}
