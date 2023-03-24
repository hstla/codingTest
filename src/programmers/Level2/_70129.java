package programmers.Level2;

// 이진 변환 반복하기

public class _70129 {
    public static int a = 0;
    public static int b = 0;
    static public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    a++;
                }
            }
            s = s.replace("0","");

            s = Integer.toBinaryString(s.length());
            b++;

        }
        answer[0] = b;
        answer[1] = a;
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution("110010101001")) System.out.println(i);

    }
}
