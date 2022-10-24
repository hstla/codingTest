package codeUpTest;
// 정렬하기
import java.util.Arrays;
import java.util.Scanner;

public class _1072 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int[] arr = new int[n];
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) arr[i] = sn.nextInt();
    for (int i : arr) System.out.println(i);

  }
}