package ThisCodingTestBook.implement;

public class RoyalNight {
    private int Solution(String s) {
        int row = s.charAt(1) - '0';
        int column = s.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RoyalNight T = new RoyalNight();
        String s = "c2";
        System.out.println(T.Solution(s));
    }

}
