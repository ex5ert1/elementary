package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void nameOfDayBy7() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }
}