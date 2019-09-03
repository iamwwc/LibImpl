package com.chaochaogege.LibImpl.leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/single-number-ii/
public class Q137 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,3,2,4,2,3,3,4,4,5};
        int res = new Q137().singleNumber(nums);
        System.out.println(res);
    }
    public int singleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int v = map.get(num);
                if (v == 2) {
                    map.remove(num);
                } else {
                    map.put(num, v + 1);
                }
            } else {
                map.put(num, 1);
            }
        }
        return (int)map.keySet().toArray()[0];
    }
}
