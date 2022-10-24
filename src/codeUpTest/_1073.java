package codeUpTest;
// 0 입력되면 종료
import java.util.Scanner;

public class _1073 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    while (true) {
      int n = sn.nextInt();
      if (n != 0) System.out.println(n);
      else break;
    }
  }
}