package ThisCodingTestBook._7BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _7FindParts3 {
    public static void main(String[] args) {
        int m = 3;
        String[] answer = new String[m];
        HashSet<Integer> s = new HashSet<>(Arrays.asList(8, 3, 7, 9, 2));
        int[] arr2 = {5, 7, 9};

        for (int i =0;i<m;i++) {
            if (s.contains(arr2[i])) answer[i] = "yes ";
            else answer[i] = "no ";
        }
        for (String str : answer) System.out.println(str);
    }
}
