package com.chaochaogege.LibImpl.common;

import java.util.List;
import java.util.Stack;

public class Tree {
    // 根据 BFS int 数组返回 TreeNode的二叉树
    // 未完成
    public static TreeNode getTreeFromLevelOrderTravel(List<Integer> arrays) {
        int rootNum = arrays.remove(0);
        TreeNode root = new TreeNode(rootNum);
        TreeNode curr = root;
        Stack<TreeNode> rootStack = new Stack<>();
        boolean isLeft = true;
        for(int i = 0 ; i < arrays.size(); i ++){
            Integer num = arrays.get(i);
            if (num != null){
                if(isLeft){
                    curr.left = new TreeNode(num);
                }else{
                    curr.right = new TreeNode(num);
                }
                continue;
            }
            isLeft = !isLeft;
        }
        return levelTravel(root, arrays,1);
    }
    private static TreeNode levelTravel(TreeNode root, List<Integer> arrays, int index) {
        return null;
    }
}
