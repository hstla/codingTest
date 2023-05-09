import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n -1, top = 0, bottom = m-1;
        while(list.size() < m* n) {
            for (int i =left;i <= right;i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i =top;i<=bottom;i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (bottom < top) break;
            for (int i = right;i>=left;i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(right < left) break;
            for (int i = bottom;i >= top;i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}