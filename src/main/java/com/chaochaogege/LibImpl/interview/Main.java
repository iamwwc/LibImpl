package com.chaochaogege.LibImpl.interview;

public class Main {
    public static void main(String[] args) {
        String test = "I like beijing.";
        String result = new Main().input(test);
        System.out.println(result);
    }

    public String input(String str) {
        String[] result = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = result.length -1 ; i >= 0 ; i --) {
            builder.append(result[i] + (i == 0 ? "" : " "));
        }
        return builder.toString();
    }
}