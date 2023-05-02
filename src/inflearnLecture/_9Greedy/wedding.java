package inflearnLecture._9Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
결혼식
5
14 18
12 15
15 20
20 30
5 14
 */
class times implements Comparable<times> {
    int s;
    char e;

    times(int s, char e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(times o) {
        if (this.s == o.s) return this.e - o.e;
        else return this.s - o.s;
    }
}

public class wedding {
    public static int solution(int n, ArrayList<times> arr) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for (times t : arr) {
            if (t.e == 's') cnt++;
            else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<times> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new times(start, 's'));
            arr.add(new times(end, 'e'));
        }
        Collections.sort(arr);
        System.out.println(solution(n, arr));
    }
}
