package codeUpTest;
// 합과 평균 구하기
import java.util.Scanner;

public class _1046 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();
    int t = sn.nextInt();
    System.out.println(i + n + t);
    System.out.printf("%.1f",(float)(i + n + t)/3);
  }
}
