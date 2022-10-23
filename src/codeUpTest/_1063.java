package codeUpTest;
// 큰 값 출력하기
import java.util.Scanner;

public class _1063 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    System.out.println((i > n) ? i : n);
  }
}
