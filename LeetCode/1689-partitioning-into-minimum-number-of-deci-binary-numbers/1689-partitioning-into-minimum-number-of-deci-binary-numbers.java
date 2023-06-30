class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for (char c : n.toCharArray()) {
            max = (c-'0' > max) ? c-'0':max;
        }
        return max;
    }
}