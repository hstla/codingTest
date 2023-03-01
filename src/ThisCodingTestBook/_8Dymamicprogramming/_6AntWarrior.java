package ThisCodingTestBook._8Dymamicprogramming;

public class _6AntWarrior {
    public static int[] d = new int[100];

    public static int solution(int n, int[] arr) {
        int answer;
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }
        answer = d[n - 1];
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 3, 1, 5};
        System.out.println(solution(n, arr));
    }
}
