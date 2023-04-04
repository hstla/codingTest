package programmers.Level2;
import java.util.HashMap;

// 위장
public class _42578 {
    static public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String tmp = clothes[i][1];
            if (map.containsKey(tmp)) map.put(tmp, map.get(tmp) + 1);
            else map.put(tmp, 1);
        }
        for (int i : map.values()) answer *= i+1;
        return answer-1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}

