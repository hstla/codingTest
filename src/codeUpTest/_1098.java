package codeUpTest;

import java.util.Scanner;

public class _1098 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    int w = scanner.nextInt();
    int[][] arr = new int[q][w];
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      int l = scanner.nextInt();
      int d = scanner.nextInt();
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      for (int j = 0; j < l; j++) {
        if (d == 0)
          arr[x - 1][y - 1 + j] = 1;
        else
          arr[x - 1 + j][y - 1] = 1;
      }
    }

    for (int i = 0; i < q; i++) {
      for (int j = 0; j < w; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}