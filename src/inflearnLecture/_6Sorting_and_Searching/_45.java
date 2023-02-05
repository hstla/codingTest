package _6Sorting_and_Searching;

import java.util.Scanner;

public class _45 {
  public int[] solution (int n, int[] arr) {
    for (int i = 0;i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    _45 T = new _45();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    for (int i : T.solution(n, arr)) System.out.print(i + " ");
  }
}
