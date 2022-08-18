package _0Mysolution._1stringTest;

import java.util.ArrayList;
import java.util.Scanner;

public class _4MyFlipWord {
  public ArrayList<String> solution(int i, String[] str){
    ArrayList<String> answer= new ArrayList<>();
    for(String x:str){
      String tmp = new StringBuilder(x).reverse().toString();
      answer.add(tmp);
    }
    return answer;
  }

  public ArrayList<String> solution1(int i,String[] str){
    ArrayList<String> answer=new ArrayList<String>(i);
    for(String x:str){
      char[] s=x.toCharArray();
      int lt=0, rt=x.length()-1;
      while(lt<rt){
        char tmp=s[lt];
        s[lt]=s[rt];
        s[rt]=tmp;
        lt++;
        rt--;
      }
      String tmp=String.valueOf(s);
      answer.add(tmp);
    }
    return answer;
  }
  public static void main(String[] args) {
    _4MyFlipWord T=new _4MyFlipWord();
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    String[] str=new String[a];
    for(int i=0;i<a;i++){
      str[i]=scanner.next();
    }
    for(String x: T.solution(a, str)){
      System.out.println(x);
    }
  }
}