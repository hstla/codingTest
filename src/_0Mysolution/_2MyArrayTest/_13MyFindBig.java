package _0Mysolution._2MyArrayTest;

import java.util.ArrayList;
import java.util.Scanner;

public class _13MyFindBig {
  public ArrayList<Integer> solution(int[] inta, int num){
    ArrayList<Integer> answer=new ArrayList<>();
    answer.add(inta[0]);
    for(int i=1;i<num;i++){
      if(inta[i]>inta[i-1]){
        answer.add(inta[i]);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _13MyFindBig T=new _13MyFindBig();
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int[] inta=new int[num];
    for(int i=0;i<num;i++){
      inta[i]=scanner.nextInt();
    }
    for(int i:T.solution(inta,num)){
      System.out.print(i+" ");
    }
  }
}
