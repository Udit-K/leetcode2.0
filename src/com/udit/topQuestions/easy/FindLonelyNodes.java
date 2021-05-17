package com.udit.topQuestions.easy;

import com.udit.topQuestions.utils.TreeNode;

import java.util.*;

public class FindLonelyNodes {

    public static void main(String[] args) {
        //[1,2,3,null,4]
        TreeNode root = new TreeNode(1);
        root.children[0] = new TreeNode(2);
        root.children[1] = new TreeNode(3);
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[][] adjArr = new int[][]{{1,3}, {1,2}, {2,4}};
//        List<TreeNode> children = new ArrayList<>(Arrays.asList(new TreeNode(2), new TreeNode(3)));
//        adjList.put(root, children);
//        adjList.put(adjList.get(root).get(0), new ArrayList<>(Arrays.asList( new TreeNode(4))));
//        adjList.put(adjList.get(root).get(1), new ArrayList<>());
//        adjList.put(adjList.get(adjList.get(root).get(0)).get(0), new ArrayList<>());

        for(int i = 0; i< adjArr.length; i++) {
            int src = adjArr[i][0];
            int dst = adjArr[i][1];

            if(!adjList.containsKey(src)) {
                adjList.put(src, new ArrayList<>(Arrays.asList(dst)));
            }else {
                adjList.get(src).add(dst);
            }
            if(!adjList.containsKey(dst)) {
                adjList.put(dst, new ArrayList<>(Arrays.asList(src)));
            }else {
                adjList.get(dst).add(src);
            }
        }
        System.out.println(adjList.toString());

        //
        TreeNode temp = root.children[0];
        Set<Integer> visited = new HashSet<>();
        temp.children[1] = new TreeNode(4);
        System.out.println(dfs(1, adjList, -1, visited));
        List[] arr = new List[25];
    }


    public static int dfs(int node, Map<Integer, List<Integer>> adjList, int parent, Set<Integer> visited) {
        if(visited.contains(node)) {
            return -1;
        }
        System.out.print(node + " ");
        visited.add(node);
        //for each child of node , go dfs for each child
        List<Integer> children = adjList.get(node);
        for(Integer child: children) {
            if(child != parent) {
                int ret = dfs(child, adjList, node, visited);
                if(ret == -1) return -1;
            }
        }
//        TreeNode left = dfs(node.children[0]);
//        TreeNode right = dfs(node.children[1]);

        return 1;
    }
}
