package ru.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int out = Factorial.calc(n);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }
}
