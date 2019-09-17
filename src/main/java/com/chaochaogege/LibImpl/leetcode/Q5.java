package com.chaochaogege.LibImpl.leetcode;

public class Q5 {
    public static void main(String[] args) {
        Q5 o = new Q5();
        String s = "aaabcccccbb";
        assert o.longestPalindrome(s).equals("bcccccb");
    }
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int charlen = chars.length;
        int max = 0 , start = 0;
        for(int i = 0 ; i < charlen - max / 2; i ++) {
            int k = i;
            int j = i;
            while(k < charlen - 1 && chars[k] == chars[k + 1]) {
                k ++;
            }
            i = k;
            while(j > 0  && k < charlen - 1 && chars[j - 1] == chars[k + 1]) {
                j --;
                k ++;
            }
            int len = k - j + 1;
            if (max <= len){
                start = j;
                max = len;
            }
        }
        return s.substring(start, start + max);
    }
}
