package programmers.Level2;

import java.util.Arrays;

// 전화번호 목록
public class _42577 {
    static public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"123", "2123", "789"};
        System.out.println(solution(arr));
    }
}
