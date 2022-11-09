package codeUpTest;

import java.util.Scanner;

public class _1099 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] arr = new int[10][10];
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
       arr[i][j] = scanner.nextInt();
      }
    }
    int x = 1;
    int y = 1;
    while (true) {
      if(arr[x][y]==0) {
        arr[x][y] = 9;
        y++;
      }
      if (arr[x][y]==1) {
        y--;
        x++;
      }
      if (arr[x][y]==2) {
        arr[x][y] = 9;
        break;
      }
      else if (arr[x][y+1]==1 && arr[x+1][y]==1) {
        if (arr[x][y]==0) {
          arr[x][y] = 9;
          break;
        }
      }
    }

    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}