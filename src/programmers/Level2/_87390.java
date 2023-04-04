package programmers.Level2;
// n^2 배열 자르기

public class _87390 {
    static public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int) left + 1];
        int in = 0;
        for (int i = (int) left; i <= right; i++) {
            answer[in++] = Integer.max(i / n, i % n) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution(3, 2, 5)) System.out.print(i + " ");
    }
}
