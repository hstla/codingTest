package _6Sorting_and_Searching;

import java.util.Scanner;

public class _47 {
  public int[] solution (int size, int n, int[] arr) {
    int[] cache = new int[size];
    for (int x : arr) {
      int pos = -1;
      for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;
      if (pos == -1) {
        for (int i = size - 1; i >= 1; i--) {
          cache[i] = cache[i - 1];
        }
        cache[0] = x;
      } else {
        for (int i = pos; i >= 1; i--) {
          cache[i] = cache[i - 1];
        } cache[0] = x;
      }
    }
    return cache;
  }
  public static void main(String[] args) {
    _47 T = new _47();
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    for (int i : T.solution(size, n, arr)) System.out.print(i + " ");
  }
}