package com.github.algopack.datastructures.tree;

public class BinarySearchTree<T extends Comparable<T>> {
    public static class Node<T> {
        public T val; public Node<T> left, right;
        public Node(T val) { this.val = val; }
    }
    private Node<T> root;
    public void insert(T val) { root = insert(root, val); }
    private Node<T> insert(Node<T> n, T val) {
        if (n == null) return new Node<>(val);
        if (val.compareTo(n.val) < 0) n.left = insert(n.left, val);
        else n.right = insert(n.right, val);
        return n;
    }
}
