package ru.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (!isValid(x1) || !isValid(x2) || !isValid(y1) || !isValid(y2)) {
            return 0;
        }

        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            return Math.abs(x1 - x2);
        }
        return 0;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}



