import java.io.*;

class Main {
    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    public static boolean boom = false;

    public static int n;
    public static char[][] mine;
    ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        mine = new char[n][n];

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < tmp.length(); j++) {
                mine[i][j] = tmp.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < tmp.length(); j++) {
                arr[i][j] = tmp.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'x') {
                    arr[i][j] = findMine(i, j);
                }
            }
        }
        if (boom) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mine[i][j] == '*') {
                        System.out.print('*');
                    } else {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    private static char findMine(int i, int j) {
        // 48 ~ 57  0  ~ 9
        if (mine[i][j] == '*') {
            boom = true;
            return '*';
        }
        int count = 0;
        for (int a = 0; a < 8; a++) {
            int nx = i + dx[a];
            int ny = j + dy[a];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && mine[nx][ny] == '*') {
                count++;
            }
        }
        return (char) (count + 48);
    }
}
