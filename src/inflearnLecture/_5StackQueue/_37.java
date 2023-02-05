package _5StackQueue;
import java.util.Scanner;
import java.util.Stack;

public class _37 {
  public StringBuilder solution(String s){
    StringBuilder answer=new StringBuilder();
    Stack<Character> tack=new Stack<>();
    for(char c:s.toCharArray()){
      if(c=='(') {
        tack.push(c);
        continue;}
      else if(c==')') {
        tack.pop();
        continue;
      }
      if(tack.size()==0){
        answer.append(c);
      }
    }
    return answer;
  }


  public String solution1(String s){
    Stack<Character> stack=new Stack<>();
    String answer="";
    for(char c:s.toCharArray()){
      if(c==')') {
        while (stack.pop()!='(');
      }
      else stack.push(c);
    }
    for(int i=0;i<stack.size();i++) answer+=stack.get(i);
    return answer;
  }

  public static void main(String[] args) {
    _37 T=new _37();
    Scanner scanner=new Scanner(System.in);
    String s= scanner.nextLine();
    System.out.println(T.solution(s));
  }
}
