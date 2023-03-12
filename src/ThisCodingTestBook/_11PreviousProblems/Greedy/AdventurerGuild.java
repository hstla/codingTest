package ThisCodingTestBook._11PreviousProblems.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
모험자 길드
input
5
2 3 1 2 2
 */
public class AdventurerGuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int answer = 0;
        int count = 0;
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        for (int i = 0; i < x; i++) {
            count += 1;
            if (count == arr[i]) {
                count = 0;
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
