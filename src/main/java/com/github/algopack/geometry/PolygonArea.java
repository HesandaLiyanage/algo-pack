package com.github.algopack.geometry;

public class PolygonArea {
    public static double computeArea(double[] x, double[] y) {
        double area = 0; int j = x.length - 1;
        for (int i = 0; i < x.length; i++) { area += (x[j] + x[i]) * (y[j] - y[i]); j = i; }
        return Math.abs(area / 2.0);
    }
}
