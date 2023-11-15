import java.util.*;

class Solution {
    public static int[] solution(int[] fees, String[] records) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : records) {
            String[] q = s.split(" ");
            ArrayList<String> list = map.getOrDefault(q[1], new ArrayList<>());
            list.add(q[0]);
            map.put(q[1], list);
        }
        Map<String, Integer> map2 = new TreeMap<>();

        for (String s : map.keySet()) {
            int diff = 0;
            ArrayList<String> strings = map.get(s);
            if (strings.size() % 2 == 0) {
                for (int i = 0; i < strings.size() / 2; i++) {
                    diff += timeCal(strings.get(i * 2), strings.get(i * 2 + 1));
                }
            } else {
                for (int i = 0; i < strings.size() / 2; i++) {
                    diff += timeCal(strings.get(i * 2), strings.get(i * 2 + 1));
                }
                diff += timeCal(strings.get(strings.size() - 1), "23:59");
            }
            map2.put(s, timeMoney(fees, diff));
        }
        
        int[] answer = new int[map2.size()];
        int k = 0;

        for (Integer fee : map2.values()) {
            answer[k++] = fee;
        }

        return answer;
    }

    private static int timeMoney(int[] fees, int diff) {
        if (fees[0] >= diff) {
            return fees[1];
        }
        return fees[1] + (int) Math.ceil((double) (diff - fees[0])/fees[2]) * fees[3];
    }

    private static int timeCal(String time1, String time2) {
        String[] time1Arr = time1.split(":");
        String[] time2Arr = time2.split(":");

        int time1H = Integer.parseInt(time1Arr[0]);
        int time1M = Integer.parseInt(time1Arr[1]);

        int time2H = Integer.parseInt(time2Arr[0]);
        int time2M = Integer.parseInt(time2Arr[1]);

        int mDiff = time2M - time1M;
        if (mDiff < 0) {
            time2H--;
            mDiff += 60;
        }
        int hDiff = time2H - time1H;
        return hDiff * 60 + mDiff;
    }
}