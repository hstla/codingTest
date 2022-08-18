package _3TwoPointersSlidingWindow;

import java.util.Scanner;

public class _29 {
  public int solution(int k){
    int answer=0,lt=0,sum=0;
    int[] arr=new int[k];
    for(int i=0;i<k;i++) arr[i]=i+1;
    for(int rt=0;rt<(k/2)+1;rt++){
      sum+=arr[rt];
      if(sum==k) answer++;
      while(sum>=k){
        sum-=arr[lt++];
        if(sum==k)answer++;
      }
    }
    return answer;
  }
  //수학적 방법으로 구현
  public int solution1(int k){
    int answer=0, cnt=1;
    k--;
    while(k>0){
      cnt++;
      k-=cnt;
      if(k%cnt==0)answer++;
    }
    return answer;
  }


  public static void main(String[] args) {
    _29 T=new _29();
    Scanner scanner=new Scanner(System.in);
    int k=scanner.nextInt();
    System.out.println(T.solution1(k));
  }
}
