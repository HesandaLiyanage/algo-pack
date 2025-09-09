package com.github.algopack.datastructures.linear;

public class DoublyLinkedList<T> {
    public static class Node<T> {
        public T val; public Node<T> prev, next;
        public Node(T val) { this.val = val; }
    }
    private Node<T> head, tail;
    public void addLast(T val) {
        Node<T> n = new Node<>(val);
        if (head == null) head = tail = n;
        else { tail.next = n; n.prev = tail; tail = n; }
    }
}
