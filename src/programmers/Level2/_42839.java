package programmers.Level2;

/*
소수 찾기
"17"	3
"011"	2
 */
public class _42839 {
    // 소수 확인 메서드
    static public boolean[] check;
    static public char[] arrC;
    static public int answer = 0;
    static public char[] tmp;

    static public boolean findPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static public void dfs(int i, int n) {
        if (i == n) {
            int k = Integer.parseInt(new String(tmp));
            if (findPrime(k)) answer++;
        } else {
            if (!check[i]) {
                tmp[i] = arrC[i];
                check[i] = true;
                dfs(i + 1, n);
                check[i] = false;
            }
        }
    }

    static public int solution(String numbers) {
        check = new boolean[numbers.length()];
        tmp = new char[numbers.length()];
        arrC = numbers.toCharArray();
        dfs(0, numbers.length());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("17"));
    }
}
