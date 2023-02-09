package ThisCodingTestBook.greedy;

import java.util.Arrays;
import java.util.Collections;

public class numberCardGame {
    public static int mySolution(int n, int m, int[][] list) {
        int answer = 0;
        for (int i =0;i<n;i++) {
            int min_value = 10000;
            for (int j=0;j<m;j++) {
                min_value = Math.min(min_value,list[i][j]);
            }
            answer = Math.max(answer, min_value);
        }
        return answer;
    }


    public static void main(String[] args) {
        numberCardGame T = new numberCardGame();
        int n = 2;
        int m = 4;
        int[][] list = {{7,3,1,8},{3,3,3,4}};
        System.out.println(T.mySolution(n,m,list));
    }
}
