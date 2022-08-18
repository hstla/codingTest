/*2. 소문자를 대문자, 대문자를 소문자로 변환하는 문제*/
package _0Mysolution.stringTest;

import java.util.Scanner;

public class _2MyupperLower {
    public String solution(String str){
        String answer="";
        char[] a=str.toCharArray();
        for(int b = 0; b<a.length; b++){
            byte c=(byte)a[b];
            if(c<=65||c<=90){
                c+=32;
                char k=(char)c;
                answer+=k;
            }
            else{
                c-=32;
                char k=(char)c;
                answer+=k;
            }
        }
        return answer;
    }
    public String solution2(String str){
        String answer="";
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                answer+=Character.toLowerCase(c);
            }else {
                answer+=Character.toUpperCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _2MyupperLower T = new _2MyupperLower();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution2(str));
    }
}
