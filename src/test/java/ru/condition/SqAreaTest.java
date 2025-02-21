package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP5Dot5K2Square1Dot6805() {
        double expected = 1.6805;
        double p = 5.5;
        double k = 2;
        double out = SqArea.square(p, k);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenP666K222Square2() {
        double expected = 495.0302;
        int p = 666;
        double k = 222;
        double out = SqArea.square(p, k);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}
