package programmers.Level1;

import java.util.ArrayList;

// 자연수 뒤집어 배열로 만들기
public class _12932 {
  public int[] solution(long n) {
    String a = "" + n;
    int[] answer = new int[a.length()];
    int num = 0;
    while (true) {
      answer[num++] = (int) n%10;
      n/=10;
      if (n == 0) break;
    }
    return answer;
  }

  public static void main(String[] args) {
    _12932 T = new _12932();
    for (int i :T.solution(54321)) System.out.println(i);
  }
}
