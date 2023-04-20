package programmers.Level2;

// DFS 재귀함수를 사용
public class _43165 {
    static int answer = 0;

    static public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }

    static void dfs(int n, int sum, int[] numbers, int target) {
        if (n == numbers.length) {
            if (sum == target) answer++;
        } else {
            dfs(n + 1, sum + numbers[n], numbers, target);
            dfs(n + 1, sum - numbers[n], numbers, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1};
        System.out.println(solution(arr, 4));
    }
}
