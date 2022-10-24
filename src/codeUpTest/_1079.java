package codeUpTest;
// q입력까지 출력
import java.util.Scanner;

public class _1079 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    while (true) {
      char n = sn.next().charAt(0);
      System.out.println(n);
      if (n =='q') break;
    }
  }
}