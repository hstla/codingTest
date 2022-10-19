package codeUpTest;
// 8진수 출력
import java.util.Scanner;

public class _1031 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    System.out.print(Integer.toOctalString(i));
  }
}
