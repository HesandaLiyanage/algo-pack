package com.github.algopack.algorithms.graph;

import java.util.*;

public class Graph {
    private final int vertices;
    private final Map<Integer, List<int[]>> adj = new HashMap<>();
    public Graph(int vertices) {
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) adj.put(i, new ArrayList<>());
    }
    public void addEdge(int u, int v, int w) { adj.get(u).add(new int[]{v, w}); }
    public int getVertices() { return vertices; }
}
