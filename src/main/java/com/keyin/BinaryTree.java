package com.keyin;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    BinaryNode node = new BinaryNode();
    public BinaryTree() {
        this.root = null;
    }

    // Preorder traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // InOrder Traversal
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue() + " ");
        inOrder(node.getRight());
    }

    // Post Order Traversal
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getValue() + " ");
    }

    // Level Order traversal
    void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.getValue());
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }

    // Search method using level order traversal
    public void search(String value) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue().equals(value)) {
                System.out.println("The value " + value + " is found in the Tree.");
                return;
            }
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        System.out.println("The value " + value + " is not found in the Tree.");
    }

    // Delete Binary Tree
    void deleteBT() {
        root = null;
        System.out.println("BT has been successfully deleted!");
    }
}



