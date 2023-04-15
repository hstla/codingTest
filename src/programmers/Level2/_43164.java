package programmers.Level2;

import java.util.*;

public class _43164 {
    static public ArrayList<String> solution(String[][] tickets) {
        ArrayList<String> answer = new ArrayList<String>();

        answer.add("ICN");
        return answer;
    }

    public static void main(String[] args) {
        String[][] arr = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        for (String s : solution(arr)) System.out.println(s);
    }
}
