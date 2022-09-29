package _6Sorting_and_Searching;
import java.util.Scanner;

public class _44 {
  public int[] solution(int n, int[] arr){
    for (int i=0;i<n-1;i++) {
      int min = i;
      for ( int j = i+1; j < n;j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
          int tmp = arr[i];
          arr[i] = arr[min];
          arr[min] = tmp;
    }
    return arr;
  }
  public static void main(String[] args) {
    _44 T=new _44();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    for (int i: T.solution(n, arr)) System.out.print(i+" ");
  }
}
