package ThisCodingTestBook.implement;

public class GameDevelopment {

    public static int n, m, x, y, direction;
    // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
//    public static int[][] arr = new int [50][50];

    // 북, 동, 남, 서 방향 정의
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // 왼쪽으로 회전
    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        GameDevelopment T = new GameDevelopment();
        n = 4; m = 4; x = 1; y = 1; direction = 0;
        d[x][y] = 1;
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

        int cnt = 1;
        int turn_time = 0;
        while (true) {
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }

            else turn_time += 1;

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
        System.out.println(cnt);
    }
}
