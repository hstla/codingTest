package codeUpTest;

import java.util.Scanner;

public class _1090 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long i = sc.nextInt();
    long n = sc.nextInt();
    long t = sc.nextInt();
    for (int j = 1; j < t; j++) i = i * n;
    System.out.println(i);
  }
}