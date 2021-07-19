package ru.job4j.module1p5;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumByEven1(int start, int finish) {
        int sum = 0;
        if (start % 2 == 1) {
            start++;
        }
        for (int i = start; i <= finish; i += 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));

        System.out.println(sumByEven1(0, 10));
        System.out.println(sumByEven1(3, 8));
        System.out.println(sumByEven1(1, 1));
    }
}
