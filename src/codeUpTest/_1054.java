package codeUpTest;
// 둘다 참일 경우
import java.util.Scanner;

public class _1054 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    if (i == 1 && i == n) {
      System.out.println(1);
    } else System.out.println(0);
  }
}
