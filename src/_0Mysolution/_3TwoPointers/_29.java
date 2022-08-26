package _0Mysolution._3TwoPointers;

import java.util.Scanner;

public class _29 {
  public int solution(int n){
    int answer=0, sum=0, lt=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=i+1;
    for(int rt=0;rt<(n/2)+1;rt++){
      sum+=arr[rt];
      if(sum==n) answer++;
      while(sum>=n){
        sum-=arr[lt++];
        if(sum==n) answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _29 T=new _29();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    System.out.println(T.solution(n));
  }
}
