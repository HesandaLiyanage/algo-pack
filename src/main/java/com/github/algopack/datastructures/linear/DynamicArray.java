package com.github.algopack.datastructures.linear;

import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T elem) {
        if (size == data.length) data = Arrays.copyOf(data, data.length * 2);
        data[size++] = elem;
    }

    @SuppressWarnings("unchecked")
    public T get(int idx) { return (T) data[idx]; }
    public int size() { return size; }
}
