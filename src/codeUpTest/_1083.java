package codeUpTest;

import java.util.Scanner;

public class _1083 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for (int i = 1; i <= input; i++) {
      if (i == 3 || i == 6 || i == 9) System.out.print("X\t");
      else System.out.print(i+"\t");
    }
  }
}
