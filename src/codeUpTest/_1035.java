package codeUpTest;
// 16 -> 8진수
import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      String i = sn.next();
      int Hint = Integer.parseInt(i,16);
      System.out.printf("%o",Hint);
    }
}
