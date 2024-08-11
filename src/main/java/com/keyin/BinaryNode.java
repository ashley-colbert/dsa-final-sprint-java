package com.keyin;

import jakarta.persistence.*;

@Entity
@Table(name = "binary_node")
public class BinaryNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @OneToOne
    @JoinColumn(name = "left_id")
    private BinaryNode left;

    @OneToOne
    @JoinColumn(name = "right_id")
    private BinaryNode right;

    private int height;


    public BinaryNode() {}

    public BinaryNode(String value, BinaryNode left, BinaryNode right, int height) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}