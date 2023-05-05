import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> arr = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
       for (int i : nums1) {
           set1.add(i);
       }
        for (int i : nums2) {
            set2.add(i);
            set1.remove(i);
        }
        for (int i : nums1) {
            set2.remove(i);
        }
        arr.add(new ArrayList<>(set1));
        arr.add(new ArrayList<>(set2));
        return arr;
    }
}