package binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        //       9(0)
        //     /   \
        //    11(1) 3(2)
        //   /  \    \
        //  8(3) 7(4) 15(5)
        //      /
        //     6(6)

        tree.setHead(new Node(9));
        tree.getHead().setLeft(new Node(11));
        tree.getHead().setRight(new Node(3));
        tree.getHead().getLeft().setLeft(new Node(8));
        tree.getHead().getLeft().setRight(new Node(7));
        tree.getHead().getRight().setRight(new Node(15));
        tree.getHead().getLeft().getRight().setLeft(new Node(6));

        tree.DFS();
        //tree.BFS();

        /*tree.deleteByIndex(9);
        tree.DFS();
        tree.deleteByIndex(1);
        tree.DFS();*/

        tree.deleteByData(11);
        tree.DFS();
        tree.deleteByData(8);
        tree.DFS();
    }
}
