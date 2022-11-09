package codeUpTest;

import java.util.Scanner;

public class _1089 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int n = sc.nextInt();
    int t = sc.nextInt();
    int sum = i;
    for (int j = 1; j < t; j++) sum += n;
    System.out.println(sum);
  }
}