package codeUpTest;
// 참이나 거짓이 서로 같을 때
import java.util.Scanner;

public class _1057 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    if (i == n ) {
      System.out.println(1);
    } else System.out.println(0);
  }
}
