package com.leetcode.guess_number_374;

import java.util.ArrayList;
import java.util.List;


/**
 * Forward declaration of guess API.
 * @param num your guess
 * @return -1 if the number is lower than the pick,
 *          1 if the number is higher than the pick,
 *          0 if the number is equal to the pick.
 */
class GuessGame {
    private int pick;

    // Constructor to set the number to guess.
    public GuessGame(int pick) {
        this.pick = pick;
    }

    // Predefined API to compare the guessed number with the picked number.
    public int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}

// Class to implement the solution.
public class Solution extends GuessGame {
    // Constructor for the solution, passing the picked number to the superclass.
    public Solution(int pick) {
        super(pick);
    }

    // Method to implement your solution.
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        
        while (low <= high) {
            int middle = low + (high - low) / 2;
            
            int attempt = guess(middle);
            
            if (attempt == 0) return middle;
            
            if (attempt == 1) {
                low = middle + 1;
            }
            
            if (attempt == -1) {
                high = middle - 1;
                
            }
            
        
        }
        
        return -1;
    }

    // Main method for testing.
    public static void main(String[] args) {
        // Test cases.
        int n1 = 10, pick1 = 6;
        Solution game1 = new Solution(pick1);
        System.out.println("Output: " + game1.guessNumber(n1)); // Expected: 6

        int n2 = 1, pick2 = 1;
        Solution game2 = new Solution(pick2);
        System.out.println("Output: " + game2.guessNumber(n2)); // Expected: 1

        int n3 = 2, pick3 = 1;
        Solution game3 = new Solution(pick3);
        System.out.println("Output: " + game3.guessNumber(n3)); // Expected: 1
    }
}