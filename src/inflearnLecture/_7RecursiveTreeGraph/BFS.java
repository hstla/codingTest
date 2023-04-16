package inflearnLecture._7RecursiveTreeGraph;

import java.util.*;

public class BFS {
    static Node root;

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(depth + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.date + " ");
                if (cur.lt != null) q.add(cur.lt);
                if (cur.rt != null) q.add(cur.rt);
            }
            depth++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs(tree.root);
    }
}


