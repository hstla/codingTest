package inflearnLecture._7RecursiveTreeGraph;

// 재귀함수 Backtracking
public class Recursive2 {
    static public void dfs(int n) {
        if (n == 0) return;
        else {
            dfs(n / 2);
            System.out.printf(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        dfs(11);
    }
}
