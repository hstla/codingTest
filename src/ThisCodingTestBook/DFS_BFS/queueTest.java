package ThisCodingTestBook.DFS_BFS;
import java.util.*;
public class queueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(5);
        q.add(2);
        q.add(3);
        q.add(7);
        q.remove();
        q.add(1);
        q.add(4);
        q.remove();
        System.out.println(q.peek());

        System.out.println("q = " + q);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
