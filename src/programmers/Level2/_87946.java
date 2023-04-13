package programmers.Level2;

// 피로도
// 순열 알고리즘
public class _87946 {
    static public boolean check[];
    static public int max = 0;

    static public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return max;
    }

    public static void dfs(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && tired >= dungeons[i][0]) {
                check[i] = true;
                dfs(tired - dungeons[i][1], dungeons, cnt + 1);
                check[i] = false;
            }
        }
        max = (max > cnt) ? max : cnt;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {80, 20},
                {50, 40},
                {30, 10}
        };
        System.out.println(solution(80, arr));
    }

}
