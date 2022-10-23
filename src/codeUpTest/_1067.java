package codeUpTest;
// 음수, 양수, 짝수, 홀수 출력
import java.util.Scanner;

public class _1067 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    if (a > 0) {
      System.out.printf("plus\n");
    if (a % 2 == 0) {System.out.printf("even\n");}
    else {System.out.printf("odd\n");}
  }else {
      System.out.printf("minus\n");
      if (a % 2 == 0) {System.out.printf("even\n");}
      else {System.out.printf("odd\n");}
    }
  }
}