package com.chaochaogege.LibImpl.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q94 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        int white = 0, black = 1;
        Stack<Temp> stack = new Stack<>();
        stack.push(new Temp(white, root));
        List<Integer> result = new ArrayList<>();
        while(!stack.empty()) {
            Temp p = stack.pop();
            int color = p.color;
            TreeNode node = p.node;
            if (node == null) continue;
            if (color == white) {
                stack.push(new Temp(white, node.right));
                stack.push(new Temp(black,node));
                stack.push(new Temp(white, node.left));
            }else {
                result.add(node.val);
            }
        }
        return result;
    }
}

class Temp {
    public int color ;
    public TreeNode node;
    public Temp(int c, TreeNode n) {
        this.color = c;
        this.node = n;
    }
}