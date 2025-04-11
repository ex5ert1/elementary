package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4Then4() {
        int left = 1;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxThreeNumbersThenLargest() {
        int a = 4;
        int b = 9;
        int c = 6;
        int result = Max.max(a, b, c);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFourNumbersThenLargest() {
        int a = 2;
        int b = 8;
        int c = 5;
        int d = 8;
        int result = Max.max(a, b, c, d);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxNegativeNumbersThenLargest() {
        int a = -3;
        int b = -9;
        int c = -6;
        int result = Max.max(a, b, c);
        int expected = -3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxWithZeroThenCorrect() {
        int a = 0;
        int b = -5;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
