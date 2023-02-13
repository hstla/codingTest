package ThisCodingTestBook.DFS_BFS;

import java.util.Stack;

public class stackTest {
    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<>();
        sta.push(5);
        sta.push(2);
        sta.push(3);
        sta.push(7);
        System.out.println(sta.pop());
        sta.push(1);
        sta.push(4);

        //스택 최하단 원소부터 출력
        System.out.println(sta);

        //스택 최상단 원소부터 출력
        while (!sta.empty()) {
//            System.out.println(sta.peek());
//            sta.pop();
            System.out.println(sta.pop());
        }

    }
}
