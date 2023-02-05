package _0Mysolution._1stringTest;

import java.util.Scanner;

public class _3MyfindLond {
  public String solution(String str){
    String answer="";
    String[] stra=str.split("\\s");
    String a=stra[0];
    for(int i=0;i<stra.length;i++){
      if(a.length()<stra[i].length()){
        a=stra[i];
      }
    }
    answer+=a;
    return answer;
  }

  public static void main(String[] args) {
    _3MyfindLond T=new _3MyfindLond();
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();
    System.out.println(T.solution(str));
  }
}
