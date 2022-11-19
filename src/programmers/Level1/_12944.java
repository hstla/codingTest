package programmers.Level1;
// 평균구하기
public class _12944 {
  public double solution(int[] arr) {
    double answer = 0;
    double size = arr.length;
    int sum = 0;
    for (int i = 0; i<size;i++) {
      sum += arr[i];
    }
    answer = sum / size;
    return answer;
  }

  public static void main(String[] args) {
    _12944 T = new _12944();
    int[] arr = {1,2,3,4};
    System.out.println(T.solution(arr));
  }
}
