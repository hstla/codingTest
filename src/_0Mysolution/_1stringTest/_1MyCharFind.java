package _0Mysolution._1stringTest;

import java.util.Scanner;
public class _1MyCharFind {
    int i=0;
    public int solution(String str, char t) {
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        for(char x:str.toCharArray()){
            answer=plusnum(x,t);
        }
        return answer;
    }
    public int plusnum(char c,char x){
        if(c==x){i++;}
        return i;
    }

    public static void main(String[] args) {
        _1MyCharFind T = new _1MyCharFind();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}