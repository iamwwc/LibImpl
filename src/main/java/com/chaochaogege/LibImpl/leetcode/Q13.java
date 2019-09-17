package com.chaochaogege.LibImpl.leetcode;

import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
        Q13 o = new Q13();
        String test = "MCMXCIV";
        assert o.romanToInt(test) == 1994;
    }

    public int romanToInt(String s) {
        char[] arrs = s.toCharArray();
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i = 0 ; i < arrs.length; i ++) {
            int current = map.get(arrs[i]);
            int next = map.getOrDefault(i < arrs.length - 1 ? arrs[i + 1] : '1',0);
            if (next > current) {
                result += next - current;
                i += 1;
                continue;
            }
            result += current;
        }
        return result;
    }
}
