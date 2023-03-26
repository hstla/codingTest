package programmers.Level2;

public class _12911 {
    // 1개수 카운트해주는 함수
    static public int countOne(int i) {
        String n = Integer.toBinaryString(i);
        int count = 0;
        for (char c : n.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
    static public int solution(int n) {
        int answer = n;
        while (true) {
            answer++;
            if (countOne(answer) == countOne(n)) {
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}
