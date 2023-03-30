package programmers.Level2;

import java.util.Stack;

// 괄호 회전하기
public class _76502 {
    static public boolean rightBracket(String s) {
        Stack<Character> stack = new Stack<>();
        try{
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    if (stack.peek() == '(') stack.pop();
                    else return false;
                } else if (s.charAt(i) == ']') {
                    if (stack.peek() == '[') stack.pop();
                    else return false;
                } else if (s.charAt(i) == '}') {
                    if (stack.peek() == '{') stack.pop();
                    else return false;
                } else stack.push(s.charAt(i));
            }
        } catch (Exception e) {
            return false;
        }
        if (stack.isEmpty()) return true;
        return false;
    }

    static public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (rightBracket(s) == true) answer++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}
