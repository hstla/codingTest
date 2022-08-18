package _1stringCodingTest;//3. 문장 속 가장 긴 단어를 출력하시오.
import java.util.Scanner;

public class _3findLond {
    public String solution(String str){
        String[] newStr = str.split("\\s+");
        str = newStr[0];
        for(int i=0;i<newStr.length;i++){
            if(str.length() < newStr[i].length()){
                str = newStr[i];
            }
        }
        return str;
    }
    //다른 풀이
    public String solution1(String str){
        String answer= "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m){
            answer=str;
        }
        return answer;
    }

    public static void main(String[] args) {
        _3findLond T = new _3findLond();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}


