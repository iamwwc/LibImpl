package com.chaochaogege.LibImpl.TheMethodOfProgramming;

// 字符串的包含
// sub中的字符都存在于 src中
// 这里的包含不是包含字串
public class Q_1_2_StringContain {
    public static void main(String[] args) {
        Q_1_2_StringContain o = new Q_1_2_StringContain();
        String src = "I am a students", sub = "am a";
        assert o.StringContainV1(src,sub);
    }

    public boolean StringContainV1(String src, String sub) {
        for(int i = 0 ; i < sub.length() ; i ++){
            int j = 0;
            for(; j < src.length() && src.charAt(j) != sub.charAt(i); j ++);
            return !(j >= sub.length());
        }
        return true;
    }
}
