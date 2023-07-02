package main.java.HW10AlgorithmsAndDataStructures.DataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleTree {
    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree();
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);

        tree.depthFirstTraversal();
        tree.breadthFirstTraversal();

        System.out.println();
        System.out.println("       50\n" +
                "     /    \\\n" +
                "   30      70\n" +
                "  /  \\    /  \\\n" +
                "20   40  60   80");
    }

    Node root;

    public SimpleTree() {
        this.root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public void depthFirstTraversal() {
        System.out.println("Depth-First Traversal:");
        depthFirstTraversalRecursive(root);
    }

    private void depthFirstTraversalRecursive(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            depthFirstTraversalRecursive(node.left);
            depthFirstTraversalRecursive(node.right);
        }
    }

    public void breadthFirstTraversal() {
        System.out.println("\nBreadth-First Traversal:");
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
