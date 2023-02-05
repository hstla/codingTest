package _2ArrayTest;

import java.util.Scanner;

public class _21GridPlates {
  public int solution(int n,int[][] gird){
    int answer=Integer.MIN_VALUE;
    int sum1,sum2;

    for(int i=0;i<n;i++){
      sum1=sum2=0;
      for(int j=0;j<n;j++){
        sum1+=gird[i][j];
        sum2+=gird[j][i];
      }
      answer=Math.max(answer, sum1);
      answer=Math.max(answer, sum2);
      }
    sum1=sum2=0;
    for(int i=0;i<n;i++){
      sum1=sum2=0;
      sum1+=gird[i][i];
      sum2+=gird[i][n-i-1];
    }
    answer=Math.max(answer, sum1);
    answer=Math.max(answer, sum2);
    return answer;
    }

  public static void main(String[] args) {
    _21GridPlates T=new _21GridPlates();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[][] grid=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        grid[i][j]=scanner.nextInt();
      }
    }
    System.out.println(T.solution(n,grid));
  }
}
