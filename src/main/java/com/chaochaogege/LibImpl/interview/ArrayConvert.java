package com.chaochaogege.LibImpl.interview;
// https://www.nowcoder.com/questionTerminal/c55f4f15cc3f4ff0adede7f9c69fa0c1
public class ArrayConvert {
    public static void main(String[] args) {
        ArrayConvert o = new ArrayConvert();
        int[] a = new int[]{1,2,3};
        assert !o.yesOrNot(a);
        a = new int[] {2,4,8};
        assert o.yesOrNot(a);
    }

    public boolean yesOrNot(int [] intarrs) {
        for ( int i = 0 ; i < intarrs.length - 1; i ++) {
            if(!isOk(intarrs[i],intarrs[i + 1])) {
                System.out.println("NO");
                return false;
            }
        }
        System.out.println("YES");
        return true;
    }

    public boolean isOk(int num1, int num2) {
        int more = num1, less = num2 ;
        if (num1 < num2){
            more = num2;
            less = num1;
        }
        // 4 100
        // 3 011
        // 2 010

        if (more % less == 0 && ((more / less) & (more / less - 1)) == 0) {
            return true;
        }
        return false;
    }
}

/**
 * 牛客网完美通过测试
 * import java.util.*;
 * public class Main {
 *     public static void main(String[] args) {
 *
 *         Scanner scanner = new Scanner(System.in);
 *         int n = scanner.nextInt();
 *         int[] a = new int[n];
 *         for(int i=0;i<n;i++){
 *             a[i] = scanner.nextInt();
 *         }
 *         new Main().yesOrNot(a);
 *     }
 *     public boolean yesOrNot(int [] intarrs) {
 *         for ( int i = 0 ; i < intarrs.length - 1; i ++) {
 *             if(!isOk(intarrs[i],intarrs[i + 1])) {
 *                 System.out.println("NO");
 *                 return false;
 *             }
 *         }
 *         System.out.println("YES");
 *         return true;
 *     }
 *
 *     public boolean isOk(int num1, int num2) {
 *         int more = num1, less = num2 ;
 *         if (num1 < num2){
 *             more = num2;
 *             less = num1;
 *         }
 *         // 4 100
 *         // 3 011
 *         // 2 010
 *
 *         if (more % less == 0 && ((more / less) & (more / less - 1)) == 0) {
 *             return true;
 *         }
 *         return false;
 *     }
 * }
 */
