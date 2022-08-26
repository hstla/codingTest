package _0Mysolution._3TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _26 {
  public ArrayList<Integer> solution(int n,int m,int[] a,int[] b){
    ArrayList<Integer> answer=new ArrayList<>();
    int p1=0,p2=0;
    Arrays.sort(a);
    Arrays.sort(b);
    while(p1<n&&p2<m){
      if(a[p1]==b[p2]) {
        answer.add(a[p1++]);
        p2++;
      }else if(a[p1]<b[p2]){
        p1++;
      }else{p2++;}
    }
    return answer;
  }
  public static void main(String[] args) {
    _26 T=new _26();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]= scanner.nextInt();
    }
    int m=scanner.nextInt();
    int[] b=new int[m];
    for(int i=0;i<m;i++){
      b[i]= scanner.nextInt();
    }
    for(int x:T.solution(n,m,a,b)) System.out.print(x+" ");
  }
}

