class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for (int c : n.toCharArray()) {
            int tmp = Character.getNumericValue(c);
            max = (tmp > max) ? tmp : max;
        }
        return max;
    }
}