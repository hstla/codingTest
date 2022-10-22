package codeUpTest;
// 거듭제곱 = Math.pow()
import java.util.Scanner;

public class _1048 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    System.out.println((int) (i * Math.pow(2,n)));

  }
}
