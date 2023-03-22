package ThisCodingTestBook._11PreviousProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
문자열 재정렬
input
K1KA5CB7
AJKDLSI412K4JSJ9D

output
ABCKK13
ADDIJJJKKLSS20
 */


public class _8RearrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        ArrayList<Character> arr = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            if (c >= 48 && c <= 57) sum += c - 48;
            else arr.add(c);
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) System.out.print(arr.get(i));
        System.out.print(sum);
    }
}
