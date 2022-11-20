package programmers.Level1;
// 정수 제곱근 판별
public class _12934 {
  public long solution(long n) {
    long answer = (long) Math.sqrt(n);
    if (answer*answer==n) return (long) Math.pow(answer+1,2);
    else return -1;
  }
}