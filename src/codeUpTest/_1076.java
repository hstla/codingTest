package codeUpTest;
// 영문자 역순으로 출력 a == 97
import java.util.Scanner;

public class _1076 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    char c = sn.nextLine().charAt(0);
    int n = (int) c;
    for (int i = 97; i <= n; i++) {
      System.out.printf("%c ",i);
    }
  }
}