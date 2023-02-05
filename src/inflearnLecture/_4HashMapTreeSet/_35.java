package _4HashMapTreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
//Comparator.reverseOrder은 내림차순으로 만들어준다.
public class _35 {
  public int solution(int n,int k,int[] arr){
    int answer=-1;
    TreeSet<Integer> tset=new TreeSet<>(Comparator.reverseOrder());
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int a=j+1;a<n;a++){
          tset.add(arr[i]+arr[j]+arr[a]);
        }
      }
    }
    int cnt=0;
    for(int i:tset){
      cnt+=1;
      if(cnt==k) answer=i;
    }
    return answer;
  }
  public static void main(String[] args) {
    _35 T=new _35();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]= scanner.nextInt();
    System.out.println(T.solution(n,k,arr));
  }
}
