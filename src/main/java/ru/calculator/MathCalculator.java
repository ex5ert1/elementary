package ru.calculator;
import static ru.calculator.MathFunction.*;

public class MathCalculator {
    public static double sumDifferenceAndDivision(double y, double x) {
        return subtract(y, x) + divide(y, x);
    }

    public static double sumAllOperations(double y, double x) {
        return add(y, x) + subtract(y, x) + multiply(y, x) + divide(y, x);
    }
}
