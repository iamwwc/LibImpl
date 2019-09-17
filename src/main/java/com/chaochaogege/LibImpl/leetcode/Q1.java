package com.chaochaogege.LibImpl.leetcode;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i ++) {
            if (map.containsKey(target - nums[i])){
                int k1 = map.get(target - nums[i]);
                return new int []{k1, i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public int[] twoSumV1(int [] nums, int target) {
        int max = 2047;
        int [] store = new int[max + 1];
        for (int i = 0 ; i < nums.length; i ++) {
            int diff = (target - nums[i]) & max;
            if (store[diff] != 0) {
                return new int[]{
                  store[diff] - 1, i
                };
            }
            store[nums[i] & max] = i + 1;
        }
        throw new RuntimeException("no number found");
    }
}
