package codeUpTest;
//  || 하나라도 참
import java.util.Scanner;

public class _1055 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    if (i == 1 || n == 1) {
      System.out.println(1);
    } else System.out.println(0);
  }
}
