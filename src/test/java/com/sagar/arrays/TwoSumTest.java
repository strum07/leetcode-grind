package com.sagar.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{0}, TwoSum.twoSum(new int[]{0}, 0));
        assertArrayEquals(new int[]{}, TwoSum.twoSum(new int[]{0}, 0));
    }
}
