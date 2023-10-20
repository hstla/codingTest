import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // input
        System.out.println(solution(length, arr));
    }

    static public int solution(int length, int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (i == 0) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        answer = stack.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}
