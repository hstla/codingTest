package programmers.Level2;
//점프와 순간 이동
public class _12980 {
    static public int solution(int n) {
        int ans = 1;
        while (n != 1) {
            if (n % 2 != 0) ans++;
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5000));
    }
}
