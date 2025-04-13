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

    @Test
    void when55to55then0() {
        double expected = 0;
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 5);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to1010then14Dot1421() {
        double expected = 14.1421;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);
        double eps = 0.0001f;
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenMinus34to00then5Dot0() {
        double expected = 5.0;
        Point p1 = new Point(-3, 4);
        Point p2 = new Point(0, 0);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to1010to55thenCorrectResult() {
        double expected1 = 17.3205;
        double expected2 = 8.6602;
        Point x = new Point(0, 0, 0);
        Point y = new Point(10, 10, 10);
        Point z = new Point(5, 5, 5);
        double eps = 0.0001f;
        double out1 = x.distance3d(y);
        double out2 = x.distance3d(z);
        double out3 = y.distance3d(z);
        assertThat(out1).isEqualTo(expected1, withPrecision(eps));
        assertThat(out2).isEqualTo(expected2, withPrecision(eps));
        assertThat(out3).isEqualTo(expected2, withPrecision(eps));
    }

    @Test
    void whenNegativeCoordinates_thenCorrectDistance3d() {
        double expected1 = 5.3851;
        double expected2 = 5.4772;
        double expected3 = 0.0;
        Point p1 = new Point(-3, 4, 2);
        Point p2 = new Point(0, 0, 0);
        Point p3 = new Point(-1, 5, 2);
        double out1 = p1.distance3d(p2);
        double out2 = p2.distance3d(p3);
        double out3 = p3.distance3d(p3);
        double eps = 0.0001f;
        assertThat(out1).isEqualTo(expected1, withPrecision(eps));
        assertThat(out2).isEqualTo(expected2, withPrecision(eps));
        assertThat(out3).isEqualTo(expected3, withPrecision(eps));
    }

    @Test
    void whenSamePoints_thenZeroDistance3d() {
        double expected = 0;
        Point p1 = new Point(5, 5, 5);
        Point p2 = new Point(5, 5, 5);
        Point p3 = new Point(5, 5, 5);
        double out1 = p1.distance3d(p2);
        double out2 = p1.distance3d(p3);
        double out3 = p2.distance3d(p3);
        double eps = 0.0001f;
        assertThat(out1).isEqualTo(expected, withPrecision(eps));
        assertThat(out2).isEqualTo(expected, withPrecision(eps));
        assertThat(out3).isEqualTo(expected, withPrecision(eps));
    }
}
