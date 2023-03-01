package ThisCodingTestBook._8Dymamicprogramming;

public class _7FloorConstruction {
    public static int[] d = new int[1001];

    public static int solution(int n) {
        int answer;
        d[1] = 1;
        d[2] = 3;
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + 2 * d[i - 2]) % 796796;
        }
        answer = d[n];
        return answer;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(solution(n));
    }
}
