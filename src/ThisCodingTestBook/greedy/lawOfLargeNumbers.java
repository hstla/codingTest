package ThisCodingTestBook.greedy;

import java.util.*;

public class lawOfLargeNumbers {
    public static Integer mySolution(int n, int m, int k, Integer[] list) {
        int answer = 0;
        Arrays.sort(list, Collections.reverseOrder());
        int a = list[0];
        int b = list[1];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (count == k) {
                answer += b;
                count = 0;
                continue;
            }
            answer += a;
            count++;
        }
        return answer;
    }
    public static void main(String[] args) {
        lawOfLargeNumbers T = new lawOfLargeNumbers();
        int n = 5;
        int m = 8;
        int k = 3;
        Integer[] list = {2, 4, 5, 4, 6};

        System.out.println(T.mySolution(n, m, k, list));
    }
}
