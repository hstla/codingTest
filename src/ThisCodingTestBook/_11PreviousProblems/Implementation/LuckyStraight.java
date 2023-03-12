package ThisCodingTestBook._11PreviousProblems.Implementation;

import java.time.Year;
import java.util.Scanner;

/*
럭키 스트레이트
input
123402
7755

output
LUCKY
READY
 */
public class LuckyStraight {
    public static final String yes = "LUCKY";
    public static final String no = "READY";

    public static int addInt(int a, int si2) {
        int sum = 0;
        for (int i = 0; i < si2; i++) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static String solution(String s, int si) {
        int si2 = si / 2;
        // 자리수가 홀수일 때
        if (si % 2 != 0) return no;
        else {
            String s1 = s.substring(0, si2);
            String s2 = s.substring(si2);

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            if (addInt(i1, si2) == addInt(i2, si2)) return yes;
        }
        return no;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int si = s.length();
        System.out.println(solution(s, si));
    }
}
