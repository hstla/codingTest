package codeUpTest;
// 16진수 대문자로 출력
import java.util.Locale;
import java.util.Scanner;

public class _1033 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    String str = (String) Integer.toHexString(i);
    System.out.print(str.toUpperCase(Locale.ROOT));
  }
}
