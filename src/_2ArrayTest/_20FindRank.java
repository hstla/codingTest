package _2ArrayTest;

import java.util.Scanner;

public class _20FindRank {
  public int[] solution(int n,int[] arr){
    int[] answer=new int[n];
    for(int i=0;i<n;i++){
      int cnt=1;
      for(int j=0;j<n;j++){
        if(arr[i]<arr[j]){
          cnt++;
        }
        answer[i]=cnt;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    _20FindRank T=new _20FindRank();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scanner.nextInt();
    }
    for(int t:T.solution(n,arr)){
      System.out.print(t+" ");
    }
  }
}
