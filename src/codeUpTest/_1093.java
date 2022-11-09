package codeUpTest;

import java.util.Scanner;

public class _1093 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int[] speckNumber = new int[24];

    for (int i = 0; i < a; i++) {
      int j = sc.nextInt();
      speckNumber[j-1] += 1;
    }
    for (int i = 0; i < 23; i++) {
      System.out.print(speckNumber[i] + " ");
    }
  }
}