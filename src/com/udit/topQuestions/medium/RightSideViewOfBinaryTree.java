package com.udit.topQuestions.medium;

import com.udit.topQuestions.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfBinaryTree {

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        queue.add(root);

        while(!queue.isEmpty()) {

            int len = queue.size();

            for(int i=0; i<len; i++) {

                TreeNode node = queue.poll();
                //right side view
                if(i == len-1) {
                    result.add(node.val);
                }
                //left side view
//                if(i == 0) {
//                    result.add(node.val);
//                }

                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }

            }

        }

        return result;
    }



}
