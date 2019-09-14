package com.chaochaogege.LibImpl.leetcode;

public class Q5 {
    public static void main(String[] args) {
        Q5 o = new Q5();
        String s = "babad";
        assert o.longestPalindrome(s).equals("bab");
    }
    private int start = 0;
    private int end = 0;
    private int max = 0;
    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }

        for (int i = 0 ; i < s.length() ; i ++) {
            findMax(s,i,i);
            findMax(s,i,i+ 1);
        }
        return s.substring(start,end + 1);
    }

    public void findMax(String s, int toLeft, int toRight) {
        while(toLeft >=0 && toRight < s.length() && s.charAt(toLeft) == s.charAt(toRight)) {
            toLeft --;
            toRight ++;
        }
        if (max < toRight - toLeft - 1) {
            max = toRight - toLeft - 1;
            start = toLeft + 1;
            end = toRight - 1;
        }
    }
}
