package _0Mysolution.stringTest;
// Character.isAlphabetic 문자를 받고 부울값을 리턴하는 함수 - 알파벳이 맞는지 확인해준다.
import java.util.Scanner;

public class _5MyonlyFlipWord {
  public String solution(String str){
    String answer;
    char[] c=str.toCharArray();
    int lt=0, rt=str.length()-1;
    while(lt<rt){
      if(!Character.isAlphabetic(c[lt])){
        lt++;
      }else if(!Character.isAlphabetic(c[rt])){
        rt--;
      } else{
        char tmp = c[lt];
        c[lt]=c[rt];
        c[rt]=tmp;
        lt++;
        rt--;
      }
    }
    answer=String.valueOf(c);
    return answer;
  }
  public static void main(String[] args) {
    _5MyonlyFlipWord T=new _5MyonlyFlipWord();
    Scanner scanner=new Scanner(System.in);
    String str=scanner.next();
    System.out.println(T.solution(str));
  }
}
