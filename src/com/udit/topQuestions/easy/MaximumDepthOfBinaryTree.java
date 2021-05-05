package com.udit.topQuestions.easy;

import com.udit.topQuestions.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
/*
Input: root = [3,9,20,null,null,15,7]
Output: 3
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        int level = 0;
        if(root == null) return level;

        Queue<TreeNode> levelTree = new LinkedList<>();
        levelTree.add(root);

        while (!levelTree.isEmpty()) {
            int len = levelTree.size();

            for(int i=0; i<len;i++) {
                TreeNode node = levelTree.poll();
                if(node.left != null) {
                    levelTree.add(node.left);
                }
                if(node.right != null) {
                    levelTree.add(node.right);
                }
            }
            level++;
        }
       return level;
    }
}
