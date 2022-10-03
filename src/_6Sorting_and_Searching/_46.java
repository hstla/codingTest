package _6Sorting_and_Searching;


import java.util.Scanner;

public class _46 {
  public int[] solution (int n, int[] arr) {
    for (int i = 1; i < n;i++) {
      int tmp = arr[i];
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] > tmp) {
          arr[j + 1] = arr[j];
        } else break;
        arr[j] = tmp;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    _46 T = new _46();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    for (int i : T.solution(n, arr)) System.out.print(i + " ");
  }
}