package _4HashMapTreeSet;
/*현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
 7 4
20 12 20 10 23 17 10*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _33 {
  public ArrayList<Integer> solution(int n,int k,int[] arr){
    ArrayList<Integer> answer=new ArrayList<>();
    HashMap<Integer, Integer> map=new HashMap<>();
    for(int i=0;i<k-1;i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    int lt=0;
    for(int rt=k-1;rt<n;rt++){
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
      answer.add(map.size());
      map.put(arr[lt],map.get(arr[lt])-1);
      if(map.get(arr[lt])==0){map.remove(arr[lt]);}
      lt++;
    }
    return answer;
  }
  public static void main(String[] args) {
    _33 T=new _33();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){arr[i]=scanner.nextInt();}
    for(int x:T.solution(n,k,arr)){
      System.out.print((x+" "));
    }
  }
}