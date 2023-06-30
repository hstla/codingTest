class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 0) {
            return answer;
        }
        answer = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String tmp = strs[i];
            while (tmp.indexOf(answer) != 0) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        return answer;
    }
}