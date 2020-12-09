package binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        //       9
        //     /    \
        //    6      14
        //   /  \    / \
        //  2    8  12  15
        //      /   /
        //     7   11

        //BFS: 9, 6, 14, 2, 8, 12, 15, 7, 11
        //DFS: 2, 6, 7, 8, 9, 11, 12, 14, 15

        tree.add(9);
        tree.add(6);
        tree.add(14);
        tree.add(2);
        tree.add(8);
        tree.add(7);
        tree.add(12);
        tree.add(15);
        tree.add(11);


        tree.BFS();
        tree.DFS();

        /*tree.deleteByData(9);
        tree.DFS();
        tree.deleteByData(11);
        tree.DFS();*/

        /*tree.deleteByIndex(9);
        tree.DFS();
        tree.deleteByIndex(8);
        tree.DFS();*/

    }
}
