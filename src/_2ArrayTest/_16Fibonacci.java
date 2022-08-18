package _2ArrayTest;

import java.util.Scanner;

public class _16Fibonacci {
  public int[] solution(int n){
    int[] answer=new int[n];
    answer[0]=1;
    answer[1]=1;
    for(int i=2;i<n;i++){
      answer[i]=answer[i-2]+answer[i-1];
    }
    return answer;
  }

  //배열을 사용하지 않고 피보나치수법 구현하는법
  public void solution1(int n){
    int a=1,b=1,c;
    System.out.print(a+" "+b+" ");
    for(int i=2;i<n;i++){
      c=a+b;
      System.out.print(c+" ");
      a=b;
      b=c;
    }
  }
  public static void main(String[] args) {
    _16Fibonacci T=new _16Fibonacci();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    for(int x:T.solution(n)){
      System.out.print(x+" ");
    }
    System.out.println("\t");
    T.solution1(n);
  }
}
