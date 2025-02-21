package ru.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman175Then69() {
            short in = 175;
            double expected = 86.25;
            double out = Fit.manWeight(in);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}