package com.github.algopack.datastructures;

public class DisjointSet {
    private final int[] parent;
    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    public int find(int i) {
        if (parent[i] != i) parent[i] = find(parent[i]);
        return parent[i];
    }
    public boolean union(int i, int j) {
        int rI = find(i), rJ = find(j);
        if (rI == rJ) return false;
        parent[rI] = rJ; return true;
    }
}
