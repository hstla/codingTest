package codeUpTest;
// java에서 goto문법은 사용하지 않는다.
import java.util.Scanner;

public class _1071 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    while (true) {
      int i = sn.nextInt();

      if (i == 0)
        break;
      System.out.println(i);
    }
  }
}