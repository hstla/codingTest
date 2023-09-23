import java.util.*;

public class Main {
    public static Set<String> set;
    public static boolean[] visited;
    public static String[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String k = sc.next();
        arr = new String[Integer.parseInt(n)];
        visited = new boolean[Integer.parseInt(n)];
        for (int i = 0; i < Integer.parseInt(n); i++) {
            arr[i] = sc.next();
        }
        sc.close();
        set = new HashSet<>();
        dfs(Integer.parseInt(n), Integer.parseInt(k), "");
        System.out.println(set.size());
    }

    public static void dfs(int num, int maxSelect, String sumStr) {
        if (maxSelect == 0) {
            set.add(sumStr);
            return;
        }
        for (int i = 0; i < num; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(num, maxSelect - 1, sumStr + arr[i]);
                visited[i] = false;
            }
        }
    }
}
