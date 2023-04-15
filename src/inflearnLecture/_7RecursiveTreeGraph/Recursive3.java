package inflearnLecture._7RecursiveTreeGraph;

// 재귀함수 Backtracking 팩토리얼
public class Recursive3 {
    static public int dfs(int n) {
        if (n == 1) return 1;
        else {
            return  n * dfs(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(dfs(10));
    }
}
