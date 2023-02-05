package _0Mysolution._4HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class _31 {
  public char solution(String str){
    char answer=0;
    HashMap<Character, Integer> map=new HashMap<>();
    for(char x:str.toCharArray()){
      map.put(x,map.getOrDefault(x,0)+1);
    }
    int sum=Integer.MIN_VALUE;
    for(char x:map.keySet()){
      if(map.get(x)>sum){
        sum=map.get(x);
        answer=x;
      }
    }
    System.out.println(map);
    return answer;
  }

  public static void main(String[] args) {
    _31 T=new _31();
    Scanner scanner=new Scanner(System.in);
    int c=scanner.nextInt();
    String str=scanner.next();
    System.out.println(T.solution(str));
  }
}
