package com.chaochaogege.LibImpl.common;

import java.util.List;

public class Tree {
    // 根据 BFS int 数组返回 TreeNode的二叉树
    public static TreeNode getTreeFromLevelOrderTravel(List<Integer> arrays) {
        int rootNum = arrays.remove(0);
        TreeNode root = new TreeNode(rootNum);
        return levelTravel(root, arrays,1);
    }
    private static TreeNode levelTravel(TreeNode root, List<Integer> arrays, int index) {
        return null;
    }
}
