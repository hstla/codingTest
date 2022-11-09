package codeUpTest;

import java.util.Scanner;

public class _1086 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double h = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();

    double result = (h * b * c) / 8 / 1024 / 1024;
    System.out.printf("%.2f MB",result);
  }
}
