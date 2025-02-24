package ru.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && y1 != y2) {
                rsl = 2;
            } else if (x1 != x2 || y1 != y2) {
                rsl = 1;
            } else {
                rsl = 0;
            }
        } else {
            throw new IllegalArgumentException("Coordinates must be between 0 and 7 inclusive.");
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}



