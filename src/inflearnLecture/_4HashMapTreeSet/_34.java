package _4HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _34 {
  public int solution(String s,String t){
    int answer=0;
    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();
    for(char c:t.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);
    int L=t.length()-1;
    for(int i=0;i<L;i++) map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);

    int lt=0;

    for(int rt=L;rt<s.length();rt++){
      map1.put(s.charAt(rt),map1.getOrDefault(s.charAt(rt),0)+1);
      if(map1.equals(map2)) answer++;
      map1.put(s.charAt(lt), map1.get(s.charAt(lt))-1);
      if(map1.get(s.charAt(lt))==0) map1.remove(s.charAt(lt));
      lt++;
    }
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
