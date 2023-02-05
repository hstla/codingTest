package _1stringCodingTest;/*2. 소문자를 대문자, 대문자를 소문자로 변환하는 문제*/
import java.util.Scanner;

public class _2upperLower {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
            else answer+= Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        _2upperLower T = new _2upperLower();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
