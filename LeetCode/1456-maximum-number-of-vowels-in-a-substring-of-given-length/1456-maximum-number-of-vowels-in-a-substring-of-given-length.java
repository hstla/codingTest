import java.util.*;
// 슬라이스 윈도우
class Solution {
    public static HashSet<Character> vowel = new HashSet<Character>();
    public int maxVowels(String s, int k) {
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int answer = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        int len = s.length();
        for (int i =0;i<k;i++) {
            if (vowel.contains(arr[i])) count++;
        }
        answer = count;
        // System.out.print(answer);
        
        for (int i = k;i < len;i++) {
            if (vowel.contains(arr[i])) count++;
            if (vowel.contains(arr[i-k])) count--;
            answer = Math.max(answer, count);
        }
        return answer;
    }
}