package inflearnLecture._7RecursiveTreeGraph;

// 재귀함수 Backtracking
public class Recursive1 {
    static public void DFS(int n) {
        if (n == 0) return;
        else {
            System.out.println(n);
            DFS(n - 1);
            System.out.print(n + " ");

        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
