package com.leetcode.Leaf_Similar_Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 */
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

    /**
     * Determines if two binary trees are leaf-similar.
     *
     * @param root1 the root of the first binary tree
     * @param root2 the root of the second binary tree
     * @return true if the trees are leaf-similar, false otherwise
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();

        Stack<TreeNode> stack1 = new Stack();
        stack1.push(root1);

        Stack<TreeNode> stack2 = new Stack();
        stack2.push(root2);
        
        while (!stack1.isEmpty()) {
            TreeNode current1 = stack1.pop();
            
            TreeNode left1 = current1.left;
            TreeNode right1 = current1.right;
            
            if (left1 == null && right1 == null) list1.add(current1.val);
            
            if (left1 != null) stack1.push(left1);
            if (right1 != null) stack1.push(right1);
        
            
        }
        
        
        while (!stack2.isEmpty()) {
            TreeNode current2 = stack2.pop();
            
            TreeNode left2 = current2.left;
            TreeNode right2 = current2.right;
            
            if (left2 == null && right2 == null) list2.add(current2.val);
            
            if (left2 != null) stack2.push(left2);
            if (right2 != null) stack2.push(right2);
            
        
        }
        
        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);
        
        

        return list1.equals(list2);
    }

    /**
     * Builds a binary tree from an array of Integer values (null for missing
     * nodes).
     *
     * @param values the array representing the tree in level order
     * @return the root of the binary tree
     */
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

    public static void main(String[] args) {
        // Example inputs
        Integer[] input1 = {1,2,null,3};
        Integer[] input2 = {1,3};

        // Build trees from inputs
        TreeNode root1 = buildTree(input1);
        TreeNode root2 = buildTree(input2);

        // Create an instance of Solution
        Solution solution = new Solution();

        // Call the leafSimilar method and print the result
        boolean result = solution.leafSimilar(root1, root2);
        System.out.println("Are the trees leaf-similar? " + result);
    }
}
