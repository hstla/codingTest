// stack의 대표적인 문제
package _5StackQueue;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class _36 {
  // 내가 shahmap으로 풀 때
  public String solution(String s){
    String answer="NO";
    HashMap<Character, Integer> map=new HashMap<>();
    int cnt=0;
    for(char c:s.toCharArray()){
      cnt++;
      if(cnt==s.length()&&c=='(') return "NO";
    }
    for(char c:s.toCharArray()){
      map.put(c,map.getOrDefault(c,0)+1);
    }
    if(map.get('(')==map.get(')')){
      answer="YES";
    }
    return answer;
  }

// stack으로 풀기
  public String solution1(String s){
    String answer="YES";
    Stack<Character> stack=new Stack<>();
    for(char c:s.toCharArray()){
      if(c=='(') stack.push(c);
      else {
        if(stack.isEmpty()){
          return "NO";
        }
        stack.pop();
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    _36 T=new _36();
    Scanner scanner=new Scanner(System.in);
    String s= scanner.nextLine();
    System.out.println(T.solution1(s));
  }
}
