package _2ArrayTest;
//방향 인덱스를 먼저 구현한다.
import java.util.Scanner;

public class _22MountainTop {
  int[] dx={-1,0,1,0};
  int[] dy={0,1,0,-1};
  public int solution(int n,int[][] arr){
    int answer=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        boolean flag=true;
        for(int k=0;k<4;k++){
          int nx=i+dx[k];
          int ny=j+dy[k];
          if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
            flag=false;
            break;
          }
        }
        if(flag){
          answer++;
        }
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _22MountainTop T=new _22MountainTop();
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=scanner.nextInt();
      }
    }
    System.out.println(T.solution(n,arr));
  }
}
