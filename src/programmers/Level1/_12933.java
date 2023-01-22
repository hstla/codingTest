package programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class _12933 {
    public long solution(long n) {
        String s = "";
        ArrayList<Integer> arr = new ArrayList();
        while (n > 0) {
            arr.add((int) (n % 10));
            n = n / 10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); i++ ) {
            s += arr.get(i);
        }
        return Long.parseLong(s);
    }

    public static void main(String[] args) {
        _12933 T = new _12933();
        System.out.println(T.solution(4312));
    }
}
