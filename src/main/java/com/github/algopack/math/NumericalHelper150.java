package com.github.algopack.math;

public class NumericalHelper150 {
    public static double compute(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) s += 1.0 / (i + 150);
        return s;
    }
}
