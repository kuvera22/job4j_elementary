package ru.job4j.module1p5;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= i + 1;
        }
        return result;
    }

    public static int calc1(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(0));
        System.out.println(calc(1));
        System.out.println(calc(2));
        System.out.println(calc(5));
    }
}