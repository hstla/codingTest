package _3TwoPointersSlidingWindow;

import java.util.Scanner;

public class _27MaxSales {
  //내가 구현한것 - 구현은 되었지만 쓸데없시 코드가 길다. 밑에 처럼 깔끔하게 작성하도록하자!
  public int solution(int n,int d,int[] arr){
    int answer=0;
    int sum = 0;
    for(int i=0;i<d;i++) sum+=arr[i];
    answer=sum;
    int i=d;
    while (i<n){
      sum+=arr[i];
      sum-=arr[i-d];
      i++;
      if(sum>answer){
        answer=sum;
      }
    }
    return answer;
  }
  public int solution1(int n,int d,int[] arr){
    int answer,sum = 0;
    for(int i=0;i<d;i++) sum+=arr[i];
    answer=sum;
    for(int i=d;i<n;i++){
      sum+=(arr[i]-arr[i-d]);
      answer=Math.max(answer,sum);
    }
    return answer;
  }
  public static void main(String[] args) {
    _27MaxSales T=new _27MaxSales();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int d=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
    System.out.println(T.solution1(n,d,arr));

  }
}
