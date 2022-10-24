package codeUpTest;
// 카운트다운
import java.util.Scanner;

public class _1074 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    while (true) {
      for (int i = n; i > 0; i--) System.out.println(i);
      break;
    }
  }
}