package _0Mysolution._2MyArrayTest;

import java.util.Scanner;

public class _16MyFibonacci {
  public int[] solution(int n){
    int[] answer=new int[n];
    answer[0]=1;
    answer[1]=1;
    for(int i=2;i<n;i++){
      answer[i]=answer[i-1]+answer[i-2];
    }
    return answer;
  }
  public static void main(String[] args) {
    _16MyFibonacci T=new _16MyFibonacci();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    for(int i:T.solution(n)){
      System.out.print(i+" ");
    }
  }
}
