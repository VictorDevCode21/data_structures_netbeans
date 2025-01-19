package com.leetcode.min_cost_climbins_stairs_746;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    /**
     * Method to calculate the minimum cost to reach the top of the staircase.
     *
     * @param cost Array where cost[i] is the cost of the i-th step.
     * @return The minimum cost to reach the top.
     */
    public int minCostClimbingStairs(int[] cost) {
        // length of the cost list;
        int n = cost.length;

        // Array of numbers;
        int[] numbers = new int[n + 1];


        // Iterative bottom-up DP tabulation solution
        for (int i = 2; i <= n; i++) {
            numbers[i] = Math.min(numbers[i - 1] + cost[i - 1], numbers[i - 2] + cost[i - 2]);
            
        }

        return numbers[n];
    }

    /**
     * Main method for testing the function.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Example 1
        int[] cost1 = {10, 15, 20};
        int result1 = solver.minCostClimbingStairs(cost1);
        System.out.println("Example 1 - Input: " + arrayToString(cost1) + " | Output: " + result1);

        // Example 2
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result2 = solver.minCostClimbingStairs(cost2);
        System.out.println("Example 2 - Input: " + arrayToString(cost2) + " | Output: " + result2);

        // Example 3
        int[] cost3 = {0, 0, 1, 1};
        int result3 = solver.minCostClimbingStairs(cost3);
        System.out.println("Example 3 - Input: " + arrayToString(cost3) + " | Output: " + result3);

        // Example 4
        int[] cost4 = {0, 1, 2, 2};
        int result4 = solver.minCostClimbingStairs(cost4);
        System.out.println("Example 4 - Input: " + arrayToString(cost4) + " | Output: " + result4);

        // Add more test cases as needed
    }

    /**
     * Utility method to convert an array to a string for display.
     *
     * @param array The array to convert.
     * @return String representation of the array.
     */
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
