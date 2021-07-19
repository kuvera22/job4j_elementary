package ru.job4j.module1p4;

public class ChessBoard {
    public static int wayLad(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static int waySlon(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if ((0 <= x1 && x1 <= 7) && (0 <= x2 && x2 <= 7) && (0 <= y1 && y1 <= 7) && (0 <= y2 && y2 <= 7)) {
            rsl = (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? Math.abs(x1 - x2) : rsl;
        }
        return rsl;
    }
}
