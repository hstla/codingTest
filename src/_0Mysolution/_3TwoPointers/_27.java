package _0Mysolution._3TwoPointers;

import java.util.Scanner;

public class _27 {
  public int solution(int n,int k,int[] a){
    int answer=0,sum=0;
    for (int i=0;i<k;i++) sum+=a[i];
    answer=sum;
    for(int rt=k;rt<n;rt++){
      sum+= (a[rt]-a[rt-k]);
      answer=Math.max(answer, sum);
    }
    return answer;
  }
  public static void main(String[] args) {
    _27 T=new _27();
    Scanner scanner=new Scanner(System.in);
    int n= scanner.nextInt();
    int k= scanner.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++) a[i]= scanner.nextInt();
    System.out.println(T.solution(n,k,a));
  }
}
