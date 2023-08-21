import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] keyboard = {
        {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
        {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', '-'},
        {'z', 'x', 'c', 'v', 'b', 'n', 'm', '-', '-', '-'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        char startLeft = stringTokenizer.nextToken().charAt(0);
        char startRight = stringTokenizer.nextToken().charAt(0);
        String str = br.readLine();

        int ans = calTime(startLeft, startRight, str);

        System.out.println(ans);
    }

    private static int calTime(char startLeft, char startRight, String str) {
        int time = 0;
        for (char c : str.toCharArray()) {
            int[] s, d;
            if ("qwertasdfgzxcv".indexOf(c) != -1) {
                s = getCoordinates(startLeft);
                d = getCoordinates(c);
                startLeft = c;
            } else {
                s = getCoordinates(startRight);
                d = getCoordinates(c);
                startRight = c;
            }

            time += Math.abs(s[0] - d[0]) + Math.abs(s[1] - d[1]);
            time += 1;
        }
        return time;
    }

    private static int[] getCoordinates(char c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (keyboard[i][j] == c) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
