package codeUpTest;

import java.util.Scanner;

public class _1095 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int min = Integer.MAX_VALUE;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

    for (int i : arr) {
      if (i < min) min = i;
    }
    System.out.println(min);
  }
}