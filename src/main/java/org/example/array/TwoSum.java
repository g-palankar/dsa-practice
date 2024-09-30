package org.example.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * Assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * @param nums   the array of integers
     * @param target the target integer
     * @return the indices of the two numbers
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSumWithHashTables(int[] nums, int target){
        final HashMap valueToIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            valueToIndexMap.put(nums[i], i);
        }
        for (Integer i = 0; i < nums.length; i++) {
            final Integer complement = target - nums[i];
            if(valueToIndexMap.containsKey(complement) && valueToIndexMap.get(complement) != i) return new int[]{i, (Integer) valueToIndexMap.get(complement)};
        }
        return null;
    }

    public static void main(String[] args) {
        final int[] result = twoSumWithHashTables(new int[]{1,2,3}, 5);
        System.out.println(Arrays.toString(result));
    }
}
