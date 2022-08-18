package _0Mysolution.stringTest;
//Character.isDigit() = 숫자일 때 true
//Integer.parseInt();
import java.util.Scanner;

public class _9myOnlyNumber {
  public int solution(String str){
    int  answer = 0;
    str=str.toUpperCase().replaceAll("[A-Z]","");
    answer=Integer.parseInt(str);
    return answer;
  }
  public static void main(String[] args) {
    _9myOnlyNumber T=new _9myOnlyNumber();
    Scanner scanner=new Scanner(System.in);
    String kb=scanner.nextLine();
    System.out.println(T.solution(kb));
  }
}
