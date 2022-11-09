package codeUpTest;

import java.util.Scanner;

public class _1097 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] arr = new int[19][19];
    for (int x = 0; x < 19; x++) {
      for (int y = 0; y < 19; y++) {
        int i = scanner.nextInt();
        arr[x][y] = i;
      }
    }
    int n = scanner.nextInt();
    int x, y;

    for (int i = 0; i < n; i++) {
      x = scanner.nextInt();

      for (int j = 0; j < arr.length; j++) {
        if (arr[x - 1][j] == 0) {
          arr[x - 1][j] = 1;
        } else {
          arr[x - 1][j] = 0;
        }
      }
      y = scanner.nextInt();

      for (int k = 0; k < arr.length; k++) {
        if (arr[k][y - 1] == 0) {
          arr[k][y - 1] = 1;
        } else {
          arr[k][y - 1] = 0;
        }
      }
    }

    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}