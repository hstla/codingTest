import java.util.*;

public class Main {

    static int a, t, n;
    static int repeat = 2;
    static int zeroCount, oneCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        t = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        System.out.println(solve());
    }

    public static int solve() {
        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
                if (n == 0 && zeroCount == t) {
                    return (zeroCount + oneCount - 1) % a;
                }
                if (n == 1 && oneCount == t) {
                    return (zeroCount + oneCount - 1) % a;
                }
            }
            for (int i = 0; i < repeat; i++) {
                zeroCount++;
                if (zeroCount == t && n == 0) {
                    return (zeroCount + oneCount - 1) % a;
                }
            }
            for (int i = 0; i < repeat; i++) {
                oneCount++;
                if (oneCount == t && n == 1) {
                    return (zeroCount + oneCount - 1) % a;
                }
            }
            repeat++;
        }
    }
}
