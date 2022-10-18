package codeUpTest;
//코드업 1025문제

import java.util.Scanner;

public class _1025 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.next();
    char[] arr = n.toCharArray();

    for (int i = 0; i < n.length(); i++) {
      System.out.print("["+arr[i]);
      for (int j = n.length() - 1; j > i; j--) {
        System.out.print('0');
      }
      System.out.print("] \n");
    }
  }
}