class Solution {
    public int arraySign(int[] nums) {
        int cnt = 0;
        for (int i : nums) {
            if (i==0) return 0;
            else if (i < 0) cnt++;
        }
        if (cnt % 2 == 1) return -1;
        else return 1;
        
    }
}