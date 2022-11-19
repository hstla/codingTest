package programmers.Level1;
// 자릿수 더하기
public class _12931 {
  static public int solution(int n) {
    int answer = 0;
    while (true) {
      answer += n % 10;
      n = n / 10;
      if (n == 0) break;
    }
    return answer;
  }

  public static void main(String[] args) {
    int i = 123;
    System.out.println(solution(i));
  }
}
