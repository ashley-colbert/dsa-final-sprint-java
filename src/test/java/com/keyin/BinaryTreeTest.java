package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    public void setUp() {
        tree = new BinaryTree();
    }

    @Test
    public void testInsertRoot() {
        tree.insertRoot(23);
        Assertions.assertEquals(23, tree.root.value);
    }

    @Test
    public void testInsertRec() {
        tree.insert(88);
        tree.insert(122);
        tree.insert(545);
        Assertions.assertEquals(88, tree.root.value);
        Assertions.assertEquals(122, tree.root.left.value);
        Assertions.assertEquals(545, tree.root.right.value);
    }

    @Test
    public void testDeleteBT() {
        tree.insert(34);
        tree.insert(23);
        tree.insert(77);
        tree.insert(78);
        tree.insert(23);
        tree.deleteBT();
        Assertions.assertNull(tree.root);
    }

    @Test
    public void testInsertRecLargestOnRight() {
        tree.insertRoot(12);
        tree.insertRoot(19);
        tree.insertRoot(5);
        tree.insertRoot(15);
        tree.insertRoot(28);

        Assertions.assertNotNull(tree.root);
        Assertions.assertNotNull(tree.root.right);
        Assertions.assertNotNull(tree.root.right.right);
        Assertions.assertEquals(28, tree.root.right.right.value);
    }
}
