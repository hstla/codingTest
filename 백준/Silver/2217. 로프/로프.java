import java.util.*;

public class Main {
    public int solution(int n, Integer[] arr) {
        Arrays.sort(arr);
        Integer answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Integer.max(answer, arr[i] * (n - i));
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
