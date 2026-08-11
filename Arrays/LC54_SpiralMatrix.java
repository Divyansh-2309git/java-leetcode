/*
 * Problem: LC 54 - Spiral Matrix
 *
 * Topic: Arrays / Matrix
 * Pattern: Boundary Traversal / Simulation
 * Difficulty: Medium
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n) - output list
 *
 * Approach:
 * - Maintain four boundaries: top, bottom, left, and right.
 * - Traverse the top row from left to right.
 * - Traverse the right column from top to bottom.
 * - Traverse the bottom row from right to left.
 * - Traverse the left column from bottom to top.
 * - Shrink the corresponding boundary after each traversal.
 * - Use boundary checks to avoid visiting elements more than once.
 *
 * Key Learning:
 * - Matrix traversal can be controlled using four changing boundaries.
 * - Boundary checks are important when the remaining matrix has only one row or column.
 * - The four-direction traversal pattern is useful for matrix problems.
 *
 * Date Solved: 10-08-2026
 *
 * Status: Solved With Assistance
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC54_SpiralMatrix {

    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>(); 
            int bottom = matrix.length - 1  ; 
            int right = matrix[0].length - 1 ; 
            int top = 0 ; 
            int left = 0 ; 
            while (top <= bottom && left <= right) {

                // Right
                for (int col = left; col <= right; col++) {
                    ans.add(matrix[top][col]);
                }
                top++;

                // Down
                for (int row = top; row <= bottom; row++) {
                    ans.add(matrix[row][right]);
                }
                right--;

                if(top <= bottom){
                    
                    for (int col = right; col >= left; col--) {
                        ans.add(matrix[bottom][col]);
                    }
                    bottom--;
                }

                if(left <= right){

                    for (int row = bottom; row >= top; row--) {
                        ans.add(matrix[row][left]);
                    }
                    left++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(solution.spiralOrder(matrix1));
        // [1, 2, 3, 6, 9, 8, 7, 4, 5]

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(solution.spiralOrder(matrix2));
        // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}