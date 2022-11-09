package codeUpTest;

import java.util.Scanner;

public class _1096 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[][] arr = new int[19][19];
    for (int k = 1; k <= n; k++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      arr[x-1][y-1] = 1;
    }
    for (int i=0;i<19;i++) {
      for (int j=0;j<19;j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }


  }
}