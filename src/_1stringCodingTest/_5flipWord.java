package _1stringCodingTest;// 5. 문자일때만 순서 뒤집기
import java.util.Scanner;

public class _5flipWord {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt=0, rt=str.length()-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){ //isAlphabetic()함수는 알파벳일때 참
                lt++;
            } else if(!Character.isAlphabetic(s[rt])){
                rt--;
            } else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
        _5flipWord T = new _5flipWord();
        Scanner kb = new Scanner(System.in);
        String in = kb.next();
        System.out.println(T.solution(in));
    }
}