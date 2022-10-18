package codeUpTest;

import java.util.Scanner;

public class _1027 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String[] arr = str.split("[.]");

    System.out.print(arr[2]+"-"+arr[1]+"-"+arr[0]);
  }
}
