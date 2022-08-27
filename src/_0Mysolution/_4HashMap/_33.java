package _0Mysolution._4HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _33 {
  public ArrayList<Integer> solution(int n,int k,int[] arr){
    ArrayList<Integer> answer=new ArrayList<>();
    HashMap<Integer,Integer> map1=new HashMap<>();
    for(int i=0;i<k-1;i++){
      map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
    }
    int lt=0;
    for(int rt=k-1;rt<n;rt++){
      map1.put(arr[rt],map1.getOrDefault(arr[rt],0)+1);
      if(map1.size()>k){
        map1.remove(lt++);
      }
      answer.add(map1.size());
    }
    return answer;
  }

  public static void main(String[] args) {
    _33 T=new _33();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]= scanner.nextInt();
    for(int x:T.solution(n,k,arr)){
      System.out.print(x+" ");
    }

  }
}
