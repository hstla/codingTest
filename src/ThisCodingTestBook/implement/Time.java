package ThisCodingTestBook.implement;

// 완전탐색 알고리즘: 가능한 경우의 수를 모두 검사해보는 탐색 방법
public class Time {
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static int Solution(int h) {
        int cnt =0;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Time T = new Time();
        int h = 5;
        System.out.println(T.Solution(h));
    }
}
