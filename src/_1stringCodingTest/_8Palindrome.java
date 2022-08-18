package _1stringCodingTest;//알파벳만 가지고 팰린드롬확인하기

import java.util.Scanner;

public class _8Palindrome {

    public String solution(String s){
        String answer ="NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        //System.out.println(s);
        if(s.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        _8Palindrome T = new _8Palindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}