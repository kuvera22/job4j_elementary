package ru.job4j.module1p6;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean standard = data[0];
        for (int i = 1; i < data.length; i++) {
            if (standard != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
