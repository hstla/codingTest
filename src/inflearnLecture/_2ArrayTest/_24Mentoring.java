package _2ArrayTest;

import java.util.Scanner;

public class _24Mentoring {
  public int solution(int num1,int num2, int[][] arr){ //학생 수, 테스트횟수, 결과
    int answer=0;
    for(int i=1;i<=num1;i++){
      for(int j=1;j<=num1;j++){
        int cnt=0;
        for(int k=0;k<num2;k++){
          int pi=0, pj=0;
          for(int s=0;s<num1;s++){
            if(arr[k][s]==i) pi=s;
            if(arr[k][s]==j) pj=s;
          }
          if(pi<pj) cnt++;
        }
        if(cnt==num2) answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _24Mentoring T=new _24Mentoring();
    Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
    int[][] arr=new int[num2][num1];
    for(int i=0;i<num2;i++){
      for(int j=0;j<num1;j++){
        arr[i][j]=scanner.nextInt();
      }
    }
    System.out.println(T.solution(num1,num2,arr));
  }
}