package ThisCodingTestBook.DFS_BFS;

public class Factorial {
    public static int factorial_recursive(int n) {
        if (n <= 1) return 1;
        return n * factorial_recursive(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial_recursive(10));

    }
}