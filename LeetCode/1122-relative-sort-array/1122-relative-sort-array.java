import java.util.*;

class Solution {
    static public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int num : arr2) {
            while (countMap.get(num) > 0) {
                answer.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }
        
        List<Integer> remaining = new ArrayList<>();
        for (int num : countMap.keySet()) {
            while (countMap.get(num) > 0) {
                remaining.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }
        
        Collections.sort(remaining);
        answer.addAll(remaining);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}