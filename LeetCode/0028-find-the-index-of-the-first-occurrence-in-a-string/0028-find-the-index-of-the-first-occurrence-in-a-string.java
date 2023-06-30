class Solution {
    public int strStr(String haystack, String needle) {
        int answer = 0;
        if (haystack.contains(needle)) {
            answer = haystack.indexOf(needle);            
        } else {
            return -1;
        }
        return answer;
    }
}