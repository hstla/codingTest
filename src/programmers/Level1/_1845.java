package programmers.Level1;

import java.util.*;

public class _1845 {
    static public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int answer;
        int n = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        answer = Math.min(n, set.size());
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}
