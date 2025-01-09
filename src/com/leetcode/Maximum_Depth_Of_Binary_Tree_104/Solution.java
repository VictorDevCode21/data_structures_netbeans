package com.leetcode.Maximum_Depth_Of_Binary_Tree_104;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();
                System.out.println(current.val + " ");

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }

            }

            count++;

        }

        return count;
    }

    public static void main(String[] args) {
        // Input example
        Integer[] input = {3, 9, 20, null, null, 15, 7};

        // Build the tree from the input array
        TreeNode root = buildTree(input);

        // Create an instance of Solution
        Solution solution = new Solution();

        // Call the method and print the result
        int result = solution.maxDepth(root);
        System.out.println("Max Depth: " + result);
    }

    // Helper method to build a binary tree from an array
    public static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
