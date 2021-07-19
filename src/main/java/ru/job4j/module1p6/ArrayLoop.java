package ru.job4j.module1p6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
