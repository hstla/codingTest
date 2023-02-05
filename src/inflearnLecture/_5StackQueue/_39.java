// 후위식 연산 352+*9-
package _5StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class _39 {
  public int solution(String str){
    int answer=0;
    Stack<Integer> stack=new Stack();
    for (char c:str.toCharArray()) {
      if (Character.isDigit(c)) {
        stack.push(c-48);
      }else{
        int a=stack.pop();
        int b=stack.pop();
        if (c=='+') stack.push(b+a);
        else if(c=='-') stack.push(b-a);
        else if(c=='*') stack.push(b*a);
        else if(c=='/') stack.push(b/a);
      }
      answer= stack.get(0);
    }
    return answer;
  }

  public static void main(String[] args) {
    _39 T=new _39();
    Scanner scanner=new Scanner(System.in);
    String str= scanner.nextLine();
    System.out.println(T.solution(str));
  }
}
