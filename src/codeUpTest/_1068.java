package codeUpTest;
// 등급 나누기
import java.util.Scanner;

public class _1068 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    if (a >= 90) System.out.println("A");
    else if (a >= 70) System.out.println("B");
    else if (a >= 40) System.out.println("C");
    else System.out.println("D");
  }
}