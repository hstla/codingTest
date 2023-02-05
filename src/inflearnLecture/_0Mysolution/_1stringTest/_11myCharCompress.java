package _0Mysolution._1stringTest;

import java.util.Scanner;

public class _11myCharCompress {
  public String solution(String str){
    String answer="";
    str+=" ";
    int a=1;
    for(int i=0;i<str.length()-1;i++){
      if(str.charAt(i)==str.charAt(i+1)){
        a+=1;
      }else{
        if(a>1){
          answer+=str.charAt(i);
          answer+=String.valueOf(a);
          a=1;
        }else{
          answer+=str.charAt(i);
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    _11myCharCompress T=new _11myCharCompress();
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();
    System.out.println(T.solution(str));
  }
}
