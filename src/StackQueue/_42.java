//교육과정설계
package StackQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _42 {
  public String solution(String need,String plan) {
    String answer="YES";
    Queue<Character> q = new LinkedList<>();
    for(char c:need.toCharArray()) q.offer(c);
    for(char c:plan.toCharArray()){
      if (q.contains(c)) {
        if(c!=q.peek()) return "NO";
        else q.poll();
      }
    }
    if(!q.isEmpty()) return "NO";
      return answer;
    }

  public static void main(String[] args) {
    _42 T=new _42();
    Scanner scanner = new Scanner(System.in);
    String need= scanner.nextLine();
    String plan= scanner.nextLine();
    System.out.println(T.solution(need,plan));
  }
}
