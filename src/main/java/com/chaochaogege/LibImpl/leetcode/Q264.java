package com.chaochaogege.LibImpl.leetcode;

import java.util.PriorityQueue;
import java.util.TreeSet;

// Ugly Number II
// https://leetcode.com/problems/ugly-number-ii/
public class Q264 {
    public static void main(String[] args) {
        Q264 o = new Q264();
        assert o.nthUglyNumber(10) == 12;
        assert o.nthUglyNumV2(40) == 144;
        assert o.nthUglyNumV3(40) == 144;
    }
    // dp
    public int nthUglyNumber(int input) {
        if(input == 0 || input == 1) {
            return input;
        }
        int[] arr = new int[input];
        int t2 = 0, t3 = 0, t5 = 0;
        arr[0] = 1;
        for(int i = 1; i < input ; i ++) {
            arr[i] = Integer.min(arr[t2] * 2,Integer.min(arr[t3] * 3,arr[t5] * 5));
            if (arr[i] == arr[t2] * 2) t2 ++;
            if (arr[i] == arr[t3] * 3) t3 ++;
            if (arr[i] == arr[t5] * 5) t5 ++;
        }
        return arr[input - 1];
    }
    //heap
    // min heap
    public int nthUglyNumV2(int input) {
        // Obviously, input must great than zero
        if (input <= 1) {
            return input;
        }

        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.offer(1L);
        for ( int i = 1 ; i < input ; i ++) {
            Long num = queue.poll();
            while(!queue.isEmpty() && queue.peek().equals(num)) num = queue.poll();
            queue.offer(num * 2);
            queue.offer(num * 3);
            queue.offer(num * 5);
        }
        return queue.poll().intValue();
    }

    // TreeSet

    public int nthUglyNumV3(int input) {
        // obviously, input must great than zero
        if (input <= 1) {
            return input;
        }

        TreeSet<Long> set = new TreeSet();
        set.add(1L);
        for(int i = 1 ; i < input; i ++){
            Long num = set.pollFirst();
            set.add(num * 2);
            set.add(num * 3);
            set.add(num * 5);
        }
        return set.pollFirst().intValue();
    }

}
