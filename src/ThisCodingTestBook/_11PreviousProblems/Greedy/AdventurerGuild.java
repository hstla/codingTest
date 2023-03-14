package ThisCodingTestBook._11PreviousProblems.Greedy;

import java.util.Arrays;
import java.util.Comparator;
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
        Integer[] arr = new Integer[x];
        for (int i = 0; i < x; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr,Comparator.reverseOrder());


    }
}
