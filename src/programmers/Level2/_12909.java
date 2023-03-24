package programmers.Level2;

import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호

public class _12909 {
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.empty()) return false;
                else stack.pop();
            }
        }
        if (stack.empty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(")()("));
    }
}
