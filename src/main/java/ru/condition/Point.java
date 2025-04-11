package ru.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this(first, second, 0); // Вызов конструктора с тремя параметрами
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) +
                pow(this.y - that.y, 2) +
                pow(this.z - that.z, 2));
    }
}




