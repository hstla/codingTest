package ThisCodingTestBook._8Dymamicprogramming;

// 보텀업 방식
public class _4FibonacciBottomUp {

    public static long[] d = new long[100];

    public static void main(String[] args) {
        d[1] = 1;
        d[2] = 1;
        int n = 30;

        for (int i = 3; i <= n; i++) d[i] = d[i - 1] + d[i - 2];
        System.out.println(d[n]);

    }
}
