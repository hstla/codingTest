package _0Mysolution._1stringTest;
// String일때는 equals함수사용하여 확인하기 /equalsIgnoreCase는 대소문자 상관하지 않고 비교한다.
import java.util.Scanner;

public class _7myPalate {
  public String solution(String str){
    String answer;
    String strr=str.toUpperCase();
    String a=new StringBuilder(strr).reverse().toString();
    System.out.println(strr);
    System.out.println(a);
    if(a.equalsIgnoreCase(strr)){
      answer="YES";
    }else{
      answer="NO";
    }
    return answer;
  }
  public static void main(String[] args) {
    _7myPalate T=new _7myPalate();
    Scanner scanner=new Scanner(System.in);
    String str=scanner.next();
    System.out.println(T.solution(str));
  }
}
