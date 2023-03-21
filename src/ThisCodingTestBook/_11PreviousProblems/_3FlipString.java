package ThisCodingTestBook._11PreviousProblems;

import java.util.Scanner;

public class _3FlipString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int answer = 0;
//        String s = sc.next();
//        char firstChar = s.charAt(0);
//        for (int i=1;i<s.length()-1;i++) {
//            if (firstChar != s.charAt(i) && firstChar == s.charAt(i+1)) answer +=1;
//        }
//
//        System.out.println(answer);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count0 = 0;
        int count1 = 0;
        String s = sc.next();

        if (s.charAt(0) == '1') count0 += 1;
        else count1 += 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                if (s.charAt(i + 1) == '1') count0 += 1;
                else count1 += 1;
            }
        }
        System.out.println(Math.min(count0, count1));
    }
}
