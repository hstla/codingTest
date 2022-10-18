package codeUpTest;

import java.util.Scanner;

public class _1026 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    String[] arr = str.split(":");

    System.out.println(Integer.parseInt(arr[1]));
  }
}
