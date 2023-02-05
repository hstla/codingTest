package _2ArrayTest;

import java.util.Scanner;

public class _14Height {
  public int solution(int n, int[] arr){
    int answer=1, max=arr[0];
    for(int i=1;i<n;i++){
      if(arr[i]>max){
        answer++;
        max=arr[i];
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _14Height T=new _14Height();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scanner.nextInt();
    }
    System.out.println(T.solution(n,arr));
  }
}
