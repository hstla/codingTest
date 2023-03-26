package programmers.Level2;

public class _12945 {
    static public int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }
        int answer = arr[n];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}
