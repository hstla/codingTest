package ThisCodingTestBook._11PreviousProblems.Greedy;

import java.util.Scanner;

public class MulOrAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sl = s.length();
        int[] arr = new int[sl];
        int sum = 0;

        // 입력된 문자열을 숫자열로 바꿈
        for (int i = 0; i < sl; i++) {
            char c = s.charAt(i);
            arr[i] = c - '0';
        }

        for (int i = 0; i < sl; i++) {
            if (arr[i] == 0 || sum == 0) sum += arr[i];
            else sum *= arr[i];
        }
        System.out.println(sum);
    }
}