package com.github.algopack.math;

public class NumericalHelper90 {
    public static double compute(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) s += 1.0 / (i + 90);
        return s;
    }
}
