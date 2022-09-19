package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _43 {
  class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
      this.id = id;
      this.priority = priority;
    }
  }
  public int solution(int n,int m,int[] arr) {
    int answer=1;
    Queue<Person> q = new LinkedList<>();
    for (int i = 0; i < n; i++) q.offer(new  Person(i,arr[i]));
    while (!q.isEmpty()) {
      Person tmp=q.poll();
      for (Person p : q) {
        if (p.priority > tmp.priority) {
          q.offer(tmp);
          tmp = null;
          break;
        }
      }
      if (tmp != null) {
        if(tmp.id==m) return answer;
        else answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    _43 T = new _43();
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    int m= scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    System.out.println(T.solution(n, m, arr));
  }
}
