public class BST {
    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);
        root.right.left = new Node(12);
        while (root != null) {
            System.out.print(root.data + " ");
            if (root.left != null) {
                root = root.left;
            } else {
                root = root.right;
            }

        }
    }
}