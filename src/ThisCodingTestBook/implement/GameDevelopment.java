package ThisCodingTestBook.implement;

public class GameDevelopment {
    public static int[][] d = new int[50][50];

    public static int turn_left(int direction) {
        direction -= 1;
        if (direction == -1) direction = 3;
        return direction;
    }

    public int solution(int n, int m, int x, int y, int direction, int[][] arr) {
        int answer = 1;
        int turn_time = 0;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        d[x][y] = 1;

        while (true) {
            turn_left(direction);
            int nx = x + dx[direction];
            int ny = x + dy[direction];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                answer += 1;
                turn_time = 0;
                continue;
            } else turn_time += 1;
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                else break;
                turn_time = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        GameDevelopment T = new GameDevelopment();
        int n = 4, m = 4, a = 1, b = 1, d = 0;
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        T.solution(n, m, a, b, d, arr);
    }
}
