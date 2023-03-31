package programmers.Level2;

import java.util.Arrays;

// [1차] 캐시
public class _17680 {
    static public int solution(int cacheSize, String[] cities) {
        for (int i =0;i< cities.length;i++) {
            cities[i]=cities[i].toLowerCase();
        }
        if (cacheSize == 0) return cities.length * 5;
        int answer = 0;
        String[] cache = new String[cacheSize];

        for (String city : cities) {
            int pos = -1;
            for (int i = 0; i < cacheSize; i++) {
                if (city.equals(cache[i])) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = cacheSize - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = city;
                answer += 5;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = city;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
        System.out.println(solution(2, arr));
    }
}
// 50