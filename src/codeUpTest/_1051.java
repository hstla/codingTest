package codeUpTest;
// n이 더 클 때
import java.util.Scanner;

public class _1051 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    if (i <= n) {
      System.out.println(1);
    } else System.out.println(0);
  }
}
