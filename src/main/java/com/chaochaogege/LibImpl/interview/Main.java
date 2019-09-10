package com.chaochaogege.LibImpl.interview;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        int temp = count;
//        int [] arr = new int[count];
//        for (int i = 0 ; i < temp; i ++){
//            arr[i] = scanner.nextInt();
//        }
        Main o = new Main();
        int[] t = o.test();
        int result = o.lengthOfLIS(t);
        int a= 1;
    }
    public int[] test() {
        return new int[]{6,5,3,4};
    }
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] top = new int[nums.length];
        int size = 0;
        int max = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = binarySearch(top, nums[i], size);
            top[idx] = nums[i];
            if (idx == size){
                j = i;
                size++;
            }
        }
        return nums[j];
    }

    private int binarySearch(int[] arr, int val, int end) {
        int left = 0, right = end;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= val) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (arr[left] >= val) return left;
        return right;
    }
}

/**
 * 问题：现在有许多不同身高的机器人在一条直线上排队，按顺序站成一排，排头向前，并且其它机器人均朝向排头一个方向
 * ，每个机器人都有一双只能向正前方看的眼睛，不能往斜上或斜下方向看；
 * 一般来说，如果前面有比自己高或者一样高的机器人，机器人可以看到它；举例子，有四个机器人，身高分别是6、5、3、4，身高为4的机器人往正前看，只能看到身高为5的机器人；另
 * 有四个机器人，身高分别是4、5、6、7，这种情况，每个机器人往正前看都看不到前面的机器人。现在的问题是，当很多机器人站成一排时，我们需要找出能被看到最多次数的机器人
 */