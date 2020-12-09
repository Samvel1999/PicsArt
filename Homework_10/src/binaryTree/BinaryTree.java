package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node head;
    private static int size = 0;

    private Node findByData(int data) {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        while(!queue.isEmpty()) {
            curr = queue.poll();
            if(curr.data.equals(data)) {
                return curr;
            }

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
        return null;
    }
    private Node findByIndex(int i) {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);
        if(i < 0 || i >= size) {
            return null;
        }

        while(!queue.isEmpty()) {
            curr = queue.poll();
            if(i == 0) {
                break;
            }
            i--;

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
        if(i != 0) {

            return null;
        }
        return curr;
    }
    private Node addRecursive(int data, Node curr) {
        if(curr == null) {
            return new Node(data);
        }
        if(data < curr.data) {
            curr.left = addRecursive(data, curr.left);
        }
        else {
            curr.right = addRecursive(data, curr.right);
        }

        return curr;
    }
    private void DFS(Node curr) {
        if(curr == null) {
            return;
        }

        DFS(curr.left);
        System.out.print(curr.data + " ");
        DFS(curr.right);
    }

    public void deleteByIndex(int index) {
        Node del = findByIndex(index);

        if(del == null) {
            System.out.println("There is no such a element");
            return;
        }
        Node parent = head;

        //find parent of del
        if(del != head) {
            while(parent.left != del && parent.right != del) {
                if(del.data < parent.data) {
                    parent = parent.left;
                }
                else {
                    parent = parent.right;
                }
            }
        }

        //case 1: del is leaf node
        if(del.left == null && del.right == null) {
            if(del != head) {
                if(parent.right == del) {
                    parent.right = null;
                }
                else {
                    parent.left = null;
                }
            }
            else {
                head = null;
            }
        }

        //case 2: del has two children
        else if(del.left != null && del.right != null) {
            Node swapElem = del.right;
            Node parentSwapElem = del;

            if(swapElem.left == null) {
                del.data = swapElem.data;
                del.right = swapElem.right;
                return;
            }
            while(swapElem.left != null) {
                parentSwapElem = swapElem;
                swapElem = swapElem.left;
            }

            del.data = swapElem.data;
            parentSwapElem.left = null;
        }

        else {
            Node child = (del.left != null) ? del.left : del.right;
            if(del != head) {
                if(del == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else {
                head = child;
            }
        }
    }
    public void deleteByData(int data) {
        Node del = findByData(data);

        if(del == null) {
            System.out.println("There is no such a element");
            return;
        }
        Node parent = head;

        //find parent of del
        if(del != head) {
            while(parent.left != del && parent.right != del) {
                if(data < parent.data) {
                    parent = parent.left;
                }
                else {
                    parent = parent.right;
                }
            }
        }


        //case 1: del is leaf node
        if(del.left == null && del.right == null) {
            if(del != head) {
                if(parent.right == del) {
                    parent.right = null;
                }
                else {
                    parent.left = null;
                }
            }
            else {
                head = null;
            }
        }

        //case 2: del has two children
        //swapElem is minimum element of del.right subtree
        else if(del.left != null && del.right != null) {
            Node swapElem = del.right;
            Node parentSwapElem = del;

            if(swapElem.left == null) {
                del.data = swapElem.data;
                del.right = swapElem.right;
                return;
            }
            while(swapElem.left != null) {
                parentSwapElem = swapElem;
                swapElem = swapElem.left;
            }

            del.data = swapElem.data;
            parentSwapElem.left = null;
        }

        //case 3: del has one child
        else {
            Node child = (del.left != null) ? del.left : del.right;
            if(del != head) {
                if(del == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else {
                head = child;
            }
        }
    }
    public void add(int data) {
        head = addRecursive(data, head);
        size++;
    }
    public void BFS() {
        Queue<Node> queue = new LinkedList<>();

        Node curr = head;
        queue.add(curr);

        System.out.print("BFS: ");

        while(!queue.isEmpty()) {
            curr = queue.poll();

            System.out.print(curr.data + " ");

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
        System.out.println();
    }
    public void DFS() {
        System.out.print("DFS: ");
        DFS(head);
        System.out.println();
    }



}
