package _4HashMapTreeSet;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class _31 {
  public char solution(int c,String str){
    char answer = 0;
    HashMap<Character, Integer> map=new HashMap<>();
    for(char x: str.toCharArray()){
      map.put(x,map.getOrDefault(x,0)+1);      //getOrDefault= valuer값을 가져오거나 없으면 0으로 설정한다.
    }
    int max=Integer.MIN_VALUE;
    for(char x:map.keySet()){
      if(max<map.get(x)) {
        max=map.get(x);
        answer=x;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _31 T=new _31();
    Scanner scanner=new Scanner(System.in);
    int c=scanner.nextInt();
    String str=scanner.next();
    System.out.println(T.solution(c,str));

  }
}
