package binaryTree;

public class Node {
    public Integer data;
    public Node left;
    public Node right;

    public Node(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[Node: " + data + "]";
    }
}
