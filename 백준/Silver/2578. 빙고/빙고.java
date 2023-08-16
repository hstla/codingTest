import java.util.Scanner;

class Main {
    public static int[][] arr = new int[5][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int q = 0; q < 25; q++) {
            int tmp = sc.nextInt();
            int bingo = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] == tmp) {
                        arr[i][j] = 0;
                        break;
                    }
                }
            }
            bingo += colBingo();
            bingo += rowBingo();
            bingo += diagonalBingo();
            bingo += antidiagonalBingo();
            if (bingo >= 3) {
                System.out.println(q + 1);
                break;
            }
        }
    }

    public static int colBingo() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) {
                    tmp++;
                }
            }
            if (tmp == 5) {
                count++;
            }
        }
        return count;
    }

    public static int rowBingo() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) {
                    tmp++;
                }
            }
            if (tmp == 5) {
                count++;
            }
        }
        return count;
    }

    public static int diagonalBingo() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][i] == 0) {
                count++;
            }
        }
        return count == 5 ? 1 : 0;
    }

    public static int antidiagonalBingo() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][4 - i] == 0) {
                count++;
            }
        }
        return count == 5 ? 1 : 0;
    }
}
