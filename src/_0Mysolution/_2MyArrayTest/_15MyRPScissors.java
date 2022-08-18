package _0Mysolution._2MyArrayTest;

import java.util.Scanner;

public class _15MyRPScissors {
  public String[] solution(int num,int[] A,int[] B){
    String[] answer=new String[num];
    for(int i=0;i<num;i++){
      if(A[i]==B[i]){
        answer[i]="D";
      }else if(A[i]==1 &&B[i]==3){
        answer[i]="A";
      }else if(A[i]==2 &&B[i]==1){
        answer[i]="A";
      }else if(A[i]==3 &&B[i]==2){
        answer[i]="A";
      }else{
        answer[i]="B";
      }
    }

    return answer;

  }
  public static void main(String[] args) {
    _15MyRPScissors T=new _15MyRPScissors();
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int[] A=new int[num];
    int[] B=new int[num];
    for(int i=0;i<num;i++){
      A[i]=scanner.nextInt();
    }
    for(int i=0;i<num;i++){
      B[i]=scanner.nextInt();
    }
    for(String s:T.solution(num,A,B)){
      System.out.println(s);
    }
  }
}
