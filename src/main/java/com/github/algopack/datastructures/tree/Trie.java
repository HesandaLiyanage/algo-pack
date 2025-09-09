package com.github.algopack.datastructures.tree;

import java.util.*;

public class Trie {
    private static class Node {
        Map<Character, Node> next = new HashMap<>();
        boolean isWord;
    }
    private final Node root = new Node();
    public void insert(String s) {
        Node curr = root;
        for (char c : s.toCharArray()) curr = curr.next.computeIfAbsent(c, k -> new Node());
        curr.isWord = true;
    }
}
