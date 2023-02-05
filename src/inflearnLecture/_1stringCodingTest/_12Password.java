package _1stringCodingTest;

import java.util.Scanner;

public class _12Password {
    public String solution(int t, String s){
        String answer = "";
        s=s.replace("#","1").replace("*","0");
        String[] tt = new String[t];
        for(int i=0;i<t;i++){
            tt[i] = s.substring((i)*7,7*(1+i));
        }
        int[] ttt = new int[t];
        for(int i=0;i<t;i++) {
            ttt[i] = Integer.valueOf(tt[i], 2);
        }

        for(int i=0;i<t;i++) {
            answer+= (char)ttt[i];
        }
        return answer;
    }
    //
    public String solution1(int t, String s){
        String answer="";
        for(int i=0;i<t;i++){
            String tmp=s.substring(0,7).replace("#","1").replace("*","0");
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
            s=s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        _12Password T = new _12Password();
        Scanner kb = new Scanner(System.in);
        int c = Integer.parseInt(kb.next());
        String str = kb.next();
        System.out.println(T.solution(c,str));
    }
}
