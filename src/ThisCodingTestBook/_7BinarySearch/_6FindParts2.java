package ThisCodingTestBook._7BinarySearch;
// 계수정렬
import java.util.Arrays;
import java.util.Scanner;

public class _6FindParts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 3;
        int[] arr1 = new int[10000001];
        int[] arr2 = {5, 7, 9};
        String[] answer = new String[m];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr1[x] = 1;
        }

        for (int i = 0; i < m; i++) {
            if (arr1[arr2[i]] == 1) {
                answer[i] = "yes ";
            } else answer[i] = "no ";
        }

        for (String s : answer) System.out.println(s);
    }
}

// arr1 = 8 3 7 9 2

