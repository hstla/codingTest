package _0Mysolution.stringTest;

import java.util.Scanner;

public class _6myDeduplication {
  public String solution(String str){
    String answer="";
    for(int i=0;i<str.length();i++){
      if(str.indexOf(str.charAt(i))==i){
        answer+=str.charAt(i);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    _6myDeduplication T=new _6myDeduplication();
    Scanner scanner=new Scanner(System.in);
    String str=scanner.next();
    System.out.println(T.solution(str));
  }
}
