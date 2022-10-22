package codeUpTest;
// 다음문자 출력
import java.util.Scanner;

public class _1041 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    char c = sn.next().charAt(0);
    int cc =  (int) c + 1;
    System.out.println((char) cc);
  }
}
