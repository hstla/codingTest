package _0Mysolution.MyArrayTest;

import java.util.ArrayList;
import java.util.Scanner;

public class _14MyHeight {
  public int solution(ArrayList<Integer> arr,int n){
    int intarr=1;
    int max= arr.get(0);
    for(int i=0;i<n;i++){
      if(arr.get(i)>max){
        intarr+=1;
        max=arr.get(i);
      }
    }

    return intarr;
  }
  public static void main(String[] args) {
    _14MyHeight T=new _14MyHeight();
    Scanner scanner=new Scanner(System.in);
    int i=scanner.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int n=0;n<i;n++){
      arr.add(scanner.nextInt());
    }
    System.out.println(T.solution(arr,i));
  }
}
