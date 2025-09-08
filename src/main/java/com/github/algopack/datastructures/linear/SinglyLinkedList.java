package com.github.algopack.datastructures.linear;

public class SinglyLinkedList<T> {
    public static class Node<T> {
        public T val; public Node<T> next;
        public Node(T val) { this.val = val; }
    }
    private Node<T> head;
    public void addFirst(T val) {
        Node<T> n = new Node<>(val);
        n.next = head; head = n;
    }
}
