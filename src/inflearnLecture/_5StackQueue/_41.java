package _5StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _41 {
  public int solution(int n, int m) {
    int answer=0;
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= n; i++) queue.add(i);
    while (!queue.isEmpty()) {
      for (int i = 1; i < m; i++) queue.add(queue.poll());
      queue.poll();
      if(queue.size()==1) answer=queue.poll();
    }
    return answer;
  }
  public static void main(String[] args) {
    _41 T=new _41();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    System.out.println(T.solution(n,m));
  }
}
