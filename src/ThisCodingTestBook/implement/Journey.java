package ThisCodingTestBook.implement;

public class Journey {
    public static int[] Solution(int n, char[] arr) {
        int[] answer = new int[2];
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < arr.length; i++) {
            char plan = arr[i];

            // 이동 후 좌표 구하기
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행
            x = nx;
            y = ny;
            answer[0] = x;
            answer[1] = y;
        }
        return answer;
    }
    public static void main(String[] args) {
        Journey T =new Journey();
        int n = 5;
        char[] arr = {'R','R','R','U','D','D'};

        for (int i : T.Solution(n,arr)) {
            System.out.println(i);
        }
    }
}
