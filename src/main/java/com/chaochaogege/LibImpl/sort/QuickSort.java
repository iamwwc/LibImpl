package com.chaochaogege.LibImpl.sort;

import java.util.Arrays;

/**
 * 快速排序算法
 * https://wiki.jikexueyuan.com/project/easy-learn-algorithm/fast-sort.html
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] arrs = new int[]{1,6,2,0,2,3,5,3,4};
        int l = arrs.length;
        int[] copy = Arrays.copyOfRange(arrs,0,l);
        QuickSort o =  new QuickSort().Sort(copy,0, l - 1);
        Arrays.sort(arrs,0, l);
        assert Arrays.equals(arrs,copy);
    }

    public QuickSort Sort(int [] arr, int head, int tail) {
        if (head > tail) {
            return this;
        }
        int pivot = arr[head],srcHead = head, srcTail = tail;
        while(head < tail) {
            while(head <tail && arr[tail] >= pivot) {
                tail --;
            }

            while(head < tail && arr[head] <= pivot) {
                head ++;
            }
            if (head < tail){
                int temp = arr[head];
                arr[head] = arr[tail];
                arr[tail] = temp;
            }
        }
        arr[srcHead] = arr[head];
        arr[head] = pivot;

        Sort(arr,srcHead,head - 1);
        Sort(arr,head + 1, srcTail);
        return this;
    }
}
