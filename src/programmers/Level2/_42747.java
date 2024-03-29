package programmers.Level2;
import java.util.*;
public class _42747 {
    static public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i = 0 ; i < citations.length ; i++) {
            int index = citations.length - i;
            if(citations[i] >= index) {
                answer = index;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}
