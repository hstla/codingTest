package _1stringCodingTest;//6. 중복된 알파벳 indexof를 활용해서 제거
import java.util.Scanner;

public class _6Deduplication {
    public String solution(String arg){
        String answer = "";
        for(int i=0;i<arg.length();i++){
            System.out.println(arg.charAt(i)+" "+i+" "+arg.indexOf(arg.charAt(i)));
            if(arg.indexOf(arg.charAt(i))==i){
                answer+=arg.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        _6Deduplication T = new _6Deduplication();
        Scanner kb = new Scanner(System.in);
        String in = kb.next();
        System.out.println(T.solution(in));

    }
}