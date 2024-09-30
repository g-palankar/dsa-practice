package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void returnsCorrectIndicesForPositiveNumbers() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSum.twoSumWithHashTables(nums, target));
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    public void returnsCorrectIndicesForNegativeNumbers() {
        int[] nums = {-3, -1, -2, -4};
        int target = -5;
        int[] expected = {0, 2};
        assertArrayEquals(expected, TwoSum.twoSumWithHashTables(nums, target));
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    public void returnsCorrectIndicesWhenTargetIsZero() {
        int[] nums = {-1, 1, 2, 3};
        int target = 0;
        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSum.twoSumWithHashTables(nums, target));
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    public void returnsCorrectIndicesWhenNumbersAreZero() {
        int[] nums = {0, 0, 3, 4};
        int target = 0;
        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSum.twoSumWithHashTables(nums, target));
    }
}