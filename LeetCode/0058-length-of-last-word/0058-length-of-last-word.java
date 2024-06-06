import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String answer = arr[arr.length - 1];
        int answerInt = answer.length();
        return answerInt;
    }
}