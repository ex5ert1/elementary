package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to21then2() {
        double expected = 2;
        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, 1);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1011to201110then99Dot5037() {
        double expected = 99.5037;
        Point p1 = new Point(10, 11);
        Point p2 = new Point(20, 110);
        double eps = 0.0001f;
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}
