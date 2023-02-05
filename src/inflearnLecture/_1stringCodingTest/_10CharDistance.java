package _1stringCodingTest;// 문자열과 문자를 받고 해당 문자와 떨어진 거리르 찾는 문제

import java.util.Scanner;

public class _10CharDistance {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=0;
            } else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return  answer;
    }

    public static void main(String[] args){
        _10CharDistance T = new _10CharDistance();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
