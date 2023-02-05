package _0Mysolution._3TwoPointers;

import java.util.Scanner;

public class _28 {
  public int solution(int n,int s,int[] arr){
    int answer=0,lt=0,sum=0;

    for(int rt=0;rt<n;rt++){
      sum+=arr[rt];
      if(sum==s) answer++;
      while (sum>=s){
        sum-=arr[lt++];
        if(sum==s)answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _28 T=new _28();
    Scanner scanner=new Scanner(System.in);
    int n= scanner.nextInt();
    int s= scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
    System.out.println(T.solution(n,s,arr));

  }
}
