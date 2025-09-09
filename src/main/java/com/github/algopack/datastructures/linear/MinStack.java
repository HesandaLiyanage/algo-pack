package com.github.algopack.datastructures.linear;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Deque<Integer> minStack = new ArrayDeque<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }
    public int pop() {
        int v = stack.pop();
        if (v == minStack.peek()) minStack.pop();
        return v;
    }
    public int getMin() { return minStack.peek(); }
}
