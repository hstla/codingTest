package codeUpTest;
// 삼항연산 작은 값 출력하기
import java.util.Scanner;

public class _1064 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    int b = sn.nextInt();
    int c = sn.nextInt();

    System.out.println((a<b ? a:b)<c ? (a<b ? a:b):c );
  }
}