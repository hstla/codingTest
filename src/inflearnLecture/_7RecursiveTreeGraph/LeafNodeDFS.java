package inflearnLecture._7RecursiveTreeGraph;

public class LeafNodeDFS {
    Node root;
    public int dfs(int depth, Node root) {
        if (root.lt == null && root.rt == null) return depth;
        else {
            depth++;
            int left = dfs(depth, root.lt);
            int right = dfs(depth, root.rt);
            return Math.min(left, right);
        }

    }

    public static void main(String[] args) {
        LeafNodeDFS tree = new LeafNodeDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0, tree.root));
    }

}
