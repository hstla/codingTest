package programmers.Level1;

// 약수의 합
public class _12928 {
  public int solution(int n) {
    int answer = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) answer += i;
    }
    return answer;
  }

  public static void main(String[] args) {
    _12928 T = new _12928();
    int i = 12;
    System.out.println(T.solution(i));
  }
}