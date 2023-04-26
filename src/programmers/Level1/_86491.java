package programmers.Level1;

/*
최소직사각형
4000
 */
public class _86491 {
    static public int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        for (int[] arr : sizes) {
            int w = arr[0];
            int h = arr[1];
            maxW = Math.max(w, Math.max(w, h));
            maxH = Math.max(h, Math.min(w, h));
        }
        return maxW * maxH;
    }
    public int solution1(int[][] sizes) {
        int maxW = 0; // 가장 긴 가로 길이
        int maxH = 0; // 가장 긴 세로 길이

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            // 가로와 세로 중 더 긴 길이를 찾아서 갱신
            maxW = Math.max(maxW, Math.max(w, h));
            maxH = Math.max(maxH, Math.min(w, h));
        }

        return maxW * maxH;
    }

    public static void main(String[] args) {
        int[][] arr = {{60, 50},
                {30, 70},
                {60, 30},
                {80, 40}};
        System.out.println(solution(arr));
    }
}
