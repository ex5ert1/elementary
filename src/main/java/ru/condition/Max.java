package ru.condition;

public class Max {
    public static int max(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

}

