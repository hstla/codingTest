package codeUpTest;

import java.util.Scanner;

public class _1082 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int hax = Integer.parseInt(input, 16);

    for (int i = 1; i < 16; i++) {
      String result = Integer.toHexString(hax*i).toUpperCase();
      String mul = Integer.toHexString(i).toUpperCase();
      System.out.println(input +"*" + mul +"="+result);
    }
  }
}
