package com.chaochaogege.LibImpl.leetcode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// 蛇形打印二叉树
public class Q103 {
    public static void main(String[] args) {
        new Q103().zigzagLevelOrder(new TreeNode(1));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queues = new ArrayDeque<>();
        queues.add(root);
        boolean fromLeftToRight = true;
        while(!queues.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = queues.size();
            if(fromLeftToRight) {
                for(int i = 0 ; i < size; i ++) {
                    TreeNode node = queues.pollFirst();
                    temp.add(node.val);
                    if(node.left != null) {
                        queues.addLast(node.left);
                    }
                    if (node.right != null){
                        queues.addLast(node.right);
                    }
                }
            }else{
                for(int i = 0 ; i < size; i ++){
                    TreeNode node = queues.pollLast();
                    temp.add(node.val);
                    if(node.right != null){
                        queues.addFirst(node.right);
                    }
                    if(node.left != null) {
                        queues.addFirst(node.left);
                    }
                }
            }
            result.add(temp);
            fromLeftToRight = !fromLeftToRight;
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