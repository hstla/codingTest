package _0Mysolution.stringTest;
/*1. 한 개의 문자열을 입력받고, 특정 문자를 입력받아
* 해당 특정 문자가 몇 개 존재하는지 알아내시오.*/

import java.util.Scanner;
public class _1MyCharFind {
    public int solution(String str, char t) {
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        for(char x:str.toCharArray()){
            if(x==t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _1MyCharFind T = new _1MyCharFind();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
