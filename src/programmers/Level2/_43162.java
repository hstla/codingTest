package programmers.Level2;

public class _43162 {
    static public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {  // i번 컴퓨터가 아직 방문되지 않았다면
                dfs(i, n, computers, visited);  // i번 컴퓨터와 연결된 모든 컴퓨터 방문
                answer++;  // 네트워크 개수 증가
            }
        }
        return answer;
    }

    static private void dfs(int start, int n, int[][] computers, boolean[] visited) {
        visited[start] = true;  // start번 컴퓨터 방문 처리

        for (int i = 0; i < n; i++) {
            if (computers[start][i] == 1 && !visited[i]) {  // start와 i번 컴퓨터가 연결되어 있고, i번 컴퓨터가 아직 방문되지 않았다면
                dfs(i, n, computers, visited);  // i번 컴퓨터와 연결된 모든 컴퓨터 방문
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(3, arr));
    }
}
