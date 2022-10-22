package codeUpTest;
// xor 연산
import java.util.Scanner;

public class _1056 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    if ((i ^ n) == 0 ) {
      System.out.println(0);
    } else System.out.println(1);
  }
}
