package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * k);
        double l = p / 2;
        double rsl = 0.5 * l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

