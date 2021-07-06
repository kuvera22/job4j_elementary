package ru.job4j.module;

import static ru.job4j.module.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double razAndDel(double first, double second) {
        return raz(first, second)
                + del(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + raz(first, second)
                + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + razAndDel(10, 20));
        System.out.println("Результат расчета равен: " + sumAll(10, 20));

    }
}
