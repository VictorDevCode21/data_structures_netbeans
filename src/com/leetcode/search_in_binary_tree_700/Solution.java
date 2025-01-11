package com.leetcode.search_in_binary_tree_700;

import java.util.ArrayList;
import java.util.List;
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

    public List searchBST(TreeNode root, int val) {
        List result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();

            TreeNode left = current.left;
            TreeNode right = current.right;

            if (current.val > val && left != null) {
                stack.push(left);
            } else if (current.val < val && right != null) {
                stack.push(right);
            }

            if (current.val == val) {
                result.add(current.val);
                
                Stack<TreeNode> stack2 = new Stack<>();

                if (left != null) {
                    stack2.push(left);
                }
                
                if (right != null) {
                    stack2.push(right);
                }
                
                while (!stack2.isEmpty()) {
                    TreeNode current2 = stack2.pop();
                    result.add(current2.val);
                
                    if (current2.left != null) stack2.push(current2.left);
                    
                    if (current2.right != null) result.add(current2.right);
                    
                }
                break;

            }

        }

        System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        // Example: Build the tree [4, 2, 7, 1, 3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = new Solution();

        // Call the method and test
        int target = 2;
        List<TreeNode> result = solution.searchBST(root, target);

        // Print the result (optional, customize as needed)
        if (result != null) {
            System.out.println("Subtree found with root: " + result.get(0));
        } else {
            System.out.println("Value not found in BST");
        }
    }
}
