import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        n = 1 + (4 * (n - 1));
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], ' ');
        }

        star(0, n);

        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            sb.append("*");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void star(int n, int m) {
        if (m == 1) {
            return;
        }
        if (n >= m) {
            return;
        }

        for (int i = n; i < m; i++) {
            arr[n][i] = '*';
            arr[m - 1][i] = '*';
            arr[i][n] = '*';
            arr[i][m - 1] = '*';
        }
        star(n + 2, m - 2);
    }
}
