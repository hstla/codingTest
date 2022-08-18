package _0Mysolution.stringTest;

import java.util.Scanner;

public class _12myPassworld {
  public String solution(String str,int c){
    String answer="";
    str=str.replace("#", "1").replace("*","0");
    String[] stra=new String[c];
    int[] stri=new int[c];


    for(int i=0;i<c;i++){
      stra[i]=str.substring(i*7,(i+1)*7);
    }
    for(int i=0;i<c;i++){
      stri[i]=Integer.parseInt(stra[i],2);
    }
    for(int i=0;i<c;i++){
      answer+=(char)stri[i];
    }
    return answer;
  }
  public static void main(String[] args) {
    _12myPassworld T=new _12myPassworld();
    Scanner scanner=new Scanner(System.in);
    int i=scanner.nextInt();
    String str=scanner.next();
    System.out.println(T.solution(str,i));
  }
}
