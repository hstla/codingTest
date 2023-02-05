package _1stringCodingTest;//6. 중복된 알파벳 indexof를 활용해서 제거
import java.util.Scanner;

public class _6Deduplication1 {
    public boolean asdf (char c,char[] arr) {
        int dul = 0;
        for (int i = 0; i < arr.length; i++){
            if (c == arr[i]) dul += 1;
        }
        if (dul == 1) return true;

        return false;
        }

    public String solution(String arg){
        String answer = "";
        for(int i=0;i<arg.length();i++){
            System.out.println(arg.charAt(i)+" "+i+" "+arg.indexOf(arg.charAt(i)));
            if(arg.indexOf(arg.charAt(i))==i){
                if(asdf(arg.charAt(i), arg.toCharArray())) answer += arg.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        _6Deduplication1 T = new _6Deduplication1();
        Scanner kb = new Scanner(System.in);
        String in = kb.next();
        System.out.println(T.solution(in));

    }
}