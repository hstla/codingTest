package _0Mysolution.stringTest;
//replaceAll
import java.util.Scanner;


public class _8myPalindrome {
  public String solution(String str) {
    String answer="NO";
    str=str.toUpperCase().replaceAll("[^A-Z]","");
    String tmp=new StringBuilder(str).reverse().toString();
    if(str.equals(tmp)){
      answer="YES";
    }
    return answer;
  }
    public static void main(String[] args) {
    _8myPalindrome T=new _8myPalindrome();
    Scanner scanner =new Scanner(System.in);
    String str=scanner.nextLine();
    System.out.println(T.solution(str));
  }
}
