import java.util.*;

//백준
public class Main {
    public int[] solution(int n) {
        // 300sec 60sec 10sec
        int[] answer = new int[3];
        answer[0] = n / 300;
        n %= 300;
        answer[1] = n / 60;
        n %= 60;
        answer[2] = n / 10;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        char[] arr = String.valueOf(s).toCharArray();
        if ('0' != arr[arr.length - 1]) {
            System.out.println(-1);

        } else {
            for (int i : T.solution(s)) {
                System.out.printf(i + " ");
            }
        }
    }
}
