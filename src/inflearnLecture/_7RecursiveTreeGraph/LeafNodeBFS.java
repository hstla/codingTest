package inflearnLecture._7RecursiveTreeGraph;

import java.util.*;

public class LeafNodeBFS {
    Node root;

    public int bfs(int depth, Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                Node x = q.poll();
                if (x.lt == null && x.rt == null) return depth;
                if (x.lt!=null) q.add(x.lt);
                if (x.rt!=null) q.add(x.rt);
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        LeafNodeBFS tree = new LeafNodeBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(0, tree.root));
    }
}
