package _3TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _26CombinedSet {
  public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
    ArrayList<Integer> answer=new ArrayList<>();
    int p1=0,p2=0;
    Arrays.sort(a);
    Arrays.sort(b);
    while(p2<m && p1<n){
      if(a[p1]==b[p2]) {
        answer.add(b[p2++]);
        p1++;
      }
      else if(a[p1]<b[p2]) p1++;
      else p2++;
    }
    return answer;
  }
  public static void main(String[] args) {
    _26CombinedSet T=new _26CombinedSet();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=scanner.nextInt();
    }

    int m=scanner.nextInt();
    int[] b=new int[m];
    for(int i=0;i<m;i++){
      b[i]=scanner.nextInt();
    }
    for (int x:T.solution(n,m,a,b)){
      System.out.print(x+" ");
    }
  }
}
