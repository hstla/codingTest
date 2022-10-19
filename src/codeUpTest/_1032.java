package codeUpTest;
// 16진수 출력
import java.util.Locale;
import java.util.Scanner;

public class _1032 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    System.out.print(Integer.toHexString(i));
  }
}
