package com.chaochaogege.LibImpl.TheMethodOfProgramming;

import java.util.Arrays;
// 1.1 字符串反转
// 先部分翻转，之后整体翻转
// 空间复杂度 O(1)
// 时间复杂度 O(n)
public class Q1_1_StringRotate {
    public static void main(String[] args) {
        char[] result = new Q1_1_StringRotate().RotateString(new char[]{
                'a','b','c','d','e','f'
        },2);

        assert Arrays.equals(result,new char[]{
                'c','d','e','f','a','b'
        });

        String[] wordResult = new Q1_1_StringRotate().RotateWord("I am a student.",3) ;
        assert Arrays.equals(wordResult,new String[]{
                "student.","I","am","a"
        });
    }
    public char[] RotateString(char[] s, int n) {
        reverseString(s,0,n - 1);
        reverseString(s,n,s.length - 1);
        reverseString(s,0, s.length - 1);
        return s;
    }

    private void reverseString(char[] s, int from, int to){
        while(from < to ){
            char tmp = s[from];
            s[from ++] = s[to];
            s[to --] = tmp;
        }
    }

    // 进阶题
    // 翻转英文单词句子
    public String[] RotateWord(String s,int n){
        String[] arrays = s.split(" ");
        reverseWord(arrays,0,n - 1);
        reverseWord(arrays,n,arrays.length - 1);
        reverseWord(arrays,0,arrays.length - 1);
        return arrays;
    }

    private void reverseWord(String[] s,int from, int to){
        while(from < to){
            String tmp = s[from];
            s[from ++] = s[to];
            s[to --] = tmp;
        }
    }
}
