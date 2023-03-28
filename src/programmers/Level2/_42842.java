package programmers.Level2;

// 카펫
public class _42842 {
    static public int[] solution(int brown, int yellow) {
        int width = 0, length = 0;
        int add = brown + yellow;
        boolean a = true;
        while (a) {
            width++;
            for (length = 1; length <= width; length++) {
                if (width * length == add && yellow == (width - 2) * (length - 2)) {
                    a = false;
                    break;
                }
            }
        }
        int[] answer = {width, length};
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution(10, 2)) System.out.println(i);
    }
}
