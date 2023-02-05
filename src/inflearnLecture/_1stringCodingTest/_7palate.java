package _1stringCodingTest;// 7. 회전 문자열 어디서든 읽어도 같은 문자열 이효리

import java.util.Scanner;

public class _7palate {
    // 직접 판단
    public String solution(String str){
        String answer= "YES";
        str=str.toUpperCase();
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)){return "NO";}
        }
        return answer;
    }
//    reverse()로 뒤집어서 판단하기, equalsIgnoreCase는 대소문자 무시하고 판단
//    public String solution(String str) {
//        String answer = "NO";
//        String tmp = new StringBuilder(str).reverse().toString();
//        if (str.equalsIgnoreCase(tmp)) {
//            answer = "YES";
//        }
//        return answer;
//    }

    public static void main(String[] args){
        _7palate T = new _7palate();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
