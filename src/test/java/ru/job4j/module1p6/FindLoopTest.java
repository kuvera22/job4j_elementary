package ru.job4j.module1p6;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8Then3() {
        int[] data = {3, 5, 3, 8, 9};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHas2Then1() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHas7in3to5then4() {
        int[] data = new int[]{0, 2, 5, 6, 7, 4, 6};
        int el = 7;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9in1to5thenm1() {
        int[] data = new int[]{0, 2, 5, 6, 7, 4, 6};
        int el = 9;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}