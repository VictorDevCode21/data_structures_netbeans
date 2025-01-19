/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.tribonacci_number_1137;

/**
 *
 * @author PC
 */
public class Solution {
    
     /**
     * Method to calculate the N-th Tribonacci number.
     * @param n The index of the Tribonacci number to compute.
     * @return The value of Tn.
     */
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        int[] numbers = new int[n + 1];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 1;
        
        
        for (int i = 3; i <= n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3];
        }

        return numbers[n]; // Placeholder return value
    }
    
    
    
    

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // Test case
        System.out.println("Tribonacci(" + n + "): " + solution.tribonacci(n));
    }
}
