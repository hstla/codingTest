import java.util.*;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= temp) {
                answer+= temp + 1 - nums[i];
                temp++;
            } else {
                temp = nums[i];
            }
        }
        return answer;
    }
}