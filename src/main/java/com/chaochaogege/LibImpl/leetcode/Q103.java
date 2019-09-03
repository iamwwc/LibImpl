package com.chaochaogege.LibImpl.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// 蛇形打印二叉树
public class Q103 {
    public static void main(String[] args) {
        new Q103().zigzagLevelOrder(new TreeNode(1));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> array = new ArrayDeque<>();
        boolean fromLeftToRight = true;
        array.addLast(root);
        while(!array.isEmpty()) {
            int size = array.size();
            List<Integer> tmp = new ArrayList<>();
            if(fromLeftToRight) {
                for( int i = 0 ; i < size ; i ++) {
                    TreeNode node = array.pollLast();
                    tmp.add(node.val);
                    if(node.left != null){
                        array.addFirst(node.left);
                    }
                    if(node.right != null){
                        array.addFirst(node.right);
                    }
                }
            }else{
                for( int i = 0 ; i < size; i ++) {
                    TreeNode node = array.pollFirst();
                    tmp.add(node.val);
                    if(node.right != null){
                        array.addLast(node.right);
                    }
                    if(node.left != null){
                        array.addLast(node.left);
                    }
                }
            }
            fromLeftToRight = !fromLeftToRight;
            result.add(tmp);
        }
        return result;
    }
}


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x ) {
        this.val = x;
    }
}