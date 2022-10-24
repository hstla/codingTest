package codeUpTest;
// 짝수 합 구하기
import java.util.Scanner;

public class _1078 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i%2 == 0) sum += i;
    }
    System.out.println(sum);
  }
}