package inflearnLecture._7RecursiveTreeGraph;

public class _DFS {
    Node root;

    public void dfs(Node root) {
        if (root == null) return;
        else {
            // 전위 순회
//            System.out.printf(root.date + " ");
            dfs(root.lt);
            // 중위 순회
//            System.out.printf(root.date + " ");
            dfs(root.rt);
            // 후위 순회
            System.out.printf(root.date + " ");
        }
    }

    public static void main(String[] args) {
        _DFS tree = new _DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}

class Node {
    int date;
    Node lt, rt;

    public Node(int val) {
        date = val;
        lt = rt = null;
    }
}