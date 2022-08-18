package _2ArrayTest;

import java.util.ArrayList;
import java.util.Scanner;

public class _18findePrimeNum {
  public boolean isPrime(int num){
    if(num==1)
      return false;
    for(int i=2;i<num;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> solution(int[] arr,int n){
    ArrayList<Integer> answer=new ArrayList<>();
    for(int i=0;i<n;i++){
      int tmp=arr[i];
      int reverse = 0;
      while(tmp!=0){
        int digit = tmp % 10;
        reverse = reverse * 10 + digit;
        tmp /= 10;
        }
      if(isPrime(reverse)){
        answer.add(reverse);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _18findePrimeNum T=new _18findePrimeNum();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scanner.nextInt();
    }
    for(int x:T.solution(arr, n)){
      System.out.print(x+" ");
    }
  }
}