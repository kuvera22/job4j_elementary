package ru.job4j.module1p6;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }
}
