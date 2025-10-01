package com.github.algopack.math;

public class NumericalHelper18 {
    public static double compute(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) s += 1.0 / (i + 18);
        return s;
    }
}
