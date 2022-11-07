package codeUpTest;

import java.util.Scanner;

public class _1080 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int result = 0;
    int i;
    int sum = 0;
    for (i = 0; sum < input; i++) {
      sum += i;
    }
    result = i - 1;
    System.out.println(result);
  }
}
