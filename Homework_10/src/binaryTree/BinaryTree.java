package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private void DFS(Node curr) {
        if(curr == null) {
            return;
        }

        DFS(curr.getLeft());
        System.out.print(curr.getData() + " ");
        DFS(curr.getRight());
    }

    private Node findByIndex(int i) {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);
        if(i < 0) {
            return null;
        }

        while(!queue.isEmpty()) {
            curr = queue.poll();
            if(i == 0) {
                return curr;
            }
            else {
                i--;
            }

            if(curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        return null;
    }

    private Node findByData(Integer data) {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        while(!queue.isEmpty()) {
            curr = queue.poll();
            if(curr.getData().equals(data)) {
                return curr;
            }

            if(curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        return null;
    }

    public void BFS() {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        System.out.print("BFS: ");

        while(!queue.isEmpty()) {
            curr = queue.poll();

            System.out.print(curr.getData() + " ");

            if(curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        System.out.println();
    }

    public void DFS() {
        System.out.print("DFS: ");
        DFS(head);
        System.out.println();
    }

    public void deleteByIndex(int i) {
        Node del = findByIndex(i);
        if(del == null) {
            System.out.println("There is no such a element.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        while(!queue.isEmpty()) {
            curr = queue.poll();

            if(curr.getLeft().equals(del)) {
                //Case 1: del has two child.
                if(del.getLeft() != null && del.getRight() != null) {
                    curr.setLeft(del.getLeft());
                    del.getLeft().setRight(del.getRight());
                }
                //Case 2: del has left child only.
                else if(del.getLeft() != null) {
                    curr.setLeft(del.getLeft());
                }
                //Case 3: del has right child only.
                else if(del.getRight() != null) {
                    curr.setLeft(del.getRight());
                }
                //Case 4: del has no child.
                else {
                    curr.setLeft(null);
                }
                return;
            }
            else if(curr.getRight().equals(del)) {
                //Case 1: del has two child.
                if(del.getLeft() != null && del.getRight() != null) {
                    curr.setRight(del.getLeft());
                    del.getLeft().setRight(del.getRight());
                }
                //Case 2: del has left child only.
                else if(del.getLeft() != null) {
                    curr.setRight(del.getLeft());
                }
                //Case 3: del has right child only.
                else if(del.getRight() != null) {
                    curr.setRight(del.getRight());
                }
                //Case 4: del has no child.
                else {
                    curr.setRight(null);
                }
                return;
            }

            if(curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        System.out.println();
    }

    public void deleteByData(Integer data) {
        Node del = findByData(data);

        if(del == null) {
            System.out.println("There is no such a element.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        while(!queue.isEmpty()) {
            curr = queue.poll();

            if(curr.getLeft().equals(del)) {
                //Case 1: del has two child.
                if(del.getLeft() != null && del.getRight() != null) {
                    curr.setLeft(del.getLeft());
                    del.getLeft().setRight(del.getRight());
                }
                //Case 2: del has left child only.
                else if(del.getLeft() != null) {
                    curr.setLeft(del.getLeft());
                }
                //Case 3: del has right child only.
                else if(del.getRight() != null) {
                    curr.setLeft(del.getRight());
                }
                //Case 4: del has no child.
                else {
                    curr.setLeft(null);
                }
                return;
            }
            else if(curr.getRight().equals(del)) {
                //Case 1: del has two child.
                if(del.getLeft() != null && del.getRight() != null) {
                    curr.setRight(del.getLeft());
                    del.getLeft().setRight(del.getRight());
                }
                //Case 2: del has left child only.
                else if(del.getLeft() != null) {
                    curr.setRight(del.getLeft());
                }
                //Case 3: del has right child only.
                else if(del.getRight() != null) {
                    curr.setRight(del.getRight());
                }
                //Case 4: del has no child.
                else {
                    curr.setRight(null);
                }
                return;
            }

            if(curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        System.out.println();
    }
}
