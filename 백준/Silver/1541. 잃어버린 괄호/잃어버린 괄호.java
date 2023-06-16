import java.util.*;

class Main {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        String[] split = s.split("-");
        for (int i = 0; i < split.length; i++) {
            int mulSum = 0;
            String[] splitMul = split[i].split("\\+");

            if (splitMul.length == 1) {
                mulSum = Integer.valueOf(splitMul[0]);
            } else {
                for (int j = 0; j < splitMul.length; j++) {
                    mulSum += Integer.valueOf(splitMul[j]);
                }
            }

            if (answer == Integer.MAX_VALUE) {
                answer = Integer.min(answer, mulSum);
            } else {
                answer -= mulSum;
            }

        }
        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}