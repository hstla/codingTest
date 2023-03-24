package programmers.Level2;

import java.awt.*;
import java.util.Scanner;

// JadenCase 문자열 만들기 12951
public class _12951 {
    static public String solution(String s) {
        String answer = "";
        String[] tmp = s.toLowerCase().split(" ");
        for (int i =0;i< tmp.length;i++) {
            String str = tmp[i];
            if (!str.equals("")){
                str = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
            }
            answer += str + " ";
        }
        if (s.charAt(s.length()-1) != ' ') answer = answer.trim();
        return answer;
    }
    public String solution1(String s) {
        String[] split = s.split(" ");
        String answer = "";
        for(int i=0; i<split.length; i++) {
            String str = split[i].toLowerCase();
            if(!str.equals("")) {
                str = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
            }
            answer += str + " ";
        }

        if(s.charAt(s.length()-1) != ' ') {
            answer = answer.trim();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3people   unFollowed me"));
    }
}

