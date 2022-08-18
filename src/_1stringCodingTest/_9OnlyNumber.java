package _1stringCodingTest;//문자열에서 숫자만 추출한다.


import java.util.Scanner;

public class _9OnlyNumber {
    public int solution(String s){
        int answer = 0;
        s = s.toUpperCase().replaceAll("[A-Z]","");
        int n = Integer.parseInt(s);
        answer = n;
        return answer;
    }
    // 아스키코드를 이용한 해결
    public int solution2(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57){
                answer=answer*10+(x-48);
            }
        }
        return answer;
    }

    // Character.isDigit() = 숫자일 때 true
    public int solution3(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args){
        _9OnlyNumber T = new _9OnlyNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
