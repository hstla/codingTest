package _0Mysolution._4HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class _32 {
  public String solution(String str1,String str2){
    String answer="NO";
    str1=str1.toUpperCase();
    str2=str2.toUpperCase();
    HashMap<Character, Integer> map1=new HashMap<>();
    HashMap<Character, Integer> map2=new HashMap<>();
    for(char c:str1.toCharArray()){
      map1.put(c, map1.getOrDefault(c,0)+1);
    }
    for(char c:str2.toCharArray()){
      map2.put(c, map2.getOrDefault(c,0)+1);
    }
    //System.out.println(map1.equals(map2));
    if(map1.equals(map2)){answer="YES";}
    return answer;
  }
  public static void main(String[] args) {
    _32 T=new _32();
    Scanner scanner=new Scanner(System.in);
    String str1=scanner.next();
    String str2=scanner.next();
    System.out.println(T.solution(str1,str2));
  }
}