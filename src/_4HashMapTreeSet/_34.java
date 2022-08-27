package _4HashMapTreeSet;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class _34 {
  public int solution(String s,String t){
    int answer=0;
    HashMap<Character,Integer> map1=new HashMap<>();
    for(char x:s.toCharArray()){
      map1.put(x,map1.getOrDefault(x,0)+1);
    }
    System.out.println(map1);
    return answer;
  }
  public static void main(String[] args) {
    _34 T=new _34();
    Scanner scanner=new Scanner(System.in);
    String s= scanner.nextLine();
    String t= scanner.nextLine();
    System.out.println(T.solution(s,t));
  }
}
