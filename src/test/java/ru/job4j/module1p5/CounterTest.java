package ru.job4j.module1p5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromSixToTwentyThen104() {
        int start = 6;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 104;
        Assert.assertEquals(expected, result);
    }
}