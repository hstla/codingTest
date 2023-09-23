import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] preference = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                preference[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {
                    int satisfactionSum = 0;
                    for (int l = 0; l < n; l++) {
                        satisfactionSum += Math.max(preference[l][i], Math.max(preference[l][j], preference[l][k]));
                    }
                    answer = Math.max(answer, satisfactionSum);
                }
            }
        }
        System.out.println(answer);
    }
}
