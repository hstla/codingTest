package codeUpTest;
//둘 다 0일 떄 참
import java.util.Scanner;

public class _1058 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    System.out.println((i == 0 && n == 0) ? 1 : 0);
  }
}
