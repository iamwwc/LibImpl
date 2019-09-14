package com.chaochaogege.LibImpl.leetcode;

import java.util.HashMap;

// 最长不重复子串
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Q3 {
    public static void main(String[] args) {
        String input = "tmsmfdut";
        Q3 o = new Q3();
        assert o.lengthOfLongestSubstring(input) == 6;
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i ++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
