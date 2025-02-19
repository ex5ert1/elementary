package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double rsl = Math.sqrt(dx * dx + dy * dy);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);

        double result2 = Point.distance(3, 4, 6, 8);
        System.out.println("result (3, 4) to (6, 8) " + result2);

        double result3 = Point.distance(-1, -1, 1, 1);
        System.out.println("result (-1, -1) to (1, 1) " + result3);
    }
}

