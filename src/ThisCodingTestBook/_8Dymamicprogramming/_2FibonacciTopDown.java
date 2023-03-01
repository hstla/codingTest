package ThisCodingTestBook._8Dymamicprogramming;
// 탑다운 방식
public class _2FibonacciTopDown {

    public static long[] d = new long[100];

    public static long fibo(int x) {
        System.out.println("f(" + x + ")");
        if (x == 1 || x == 2) return 1;
        // 구한 값 가져오기
        if (d[x] != 0) return d[x];
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];

    }

    public static void main(String[] args) {
//        System.out.println(fibo(50));
        fibo(6);
    }
}
