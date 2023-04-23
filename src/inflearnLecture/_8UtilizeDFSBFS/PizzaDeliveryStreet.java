package inflearnLecture._8UtilizeDFSBFS;

import java.util.Scanner;

/*
피자 배달 거리
4 4
0 1 2 0
1 0 2 1
0 2 1 2
2 0 1 2
 */
public class PizzaDeliveryStreet {
    public static int n, m, answer;
    public static int[][] board = new int[n][n];
    public static void dfs() {

    }

//    public static int diff() {
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        dfs();
    }
}
