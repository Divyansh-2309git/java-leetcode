/*
 * Problem: LC 48 - Rotate Image
 *
 * Topic: Arrays / Matrix
 * Pattern: Matrix Transposition + Row Reversal
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
 * - Only traverse the upper triangular part to avoid swapping elements twice.
 * - Reverse every row using the two-pointer swapping technique.
 * - Transposing followed by reversing each row rotates the matrix 90° clockwise.
 *
 * Key Learning:
 * - A 90° clockwise matrix rotation can be achieved using transpose + row reversal.
 * - In-place swapping allows the matrix to be rotated using O(1) extra space.
 * - When transposing, start the inner loop from i + 1 to avoid undoing swaps.
 *
 * Date Solved: 10-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC48_RotateImage {

    static class Solution {
        public void rotate(int[][] matrix) {
            for(int i = 0 ; i < matrix.length  ; i ++){
                for(int j = i + 1 ;j < matrix[0] .length ; j ++ ){
                    int temp = matrix[i][j] ; 
                    matrix[i][j] = matrix[j][i] ; 
                    matrix[j][i] = temp ; 
                }
            }
            for(int i = 0 ; i < matrix.length ; i ++ ){
                for(int j = 0 ; j < matrix[0].length / 2 ; j ++){
                    int temp = matrix[i][j] ; 
                    matrix[i][j] = matrix[i][matrix[0].length - 1 - j ] ; 
                    matrix[i][matrix[0].length - 1 - j ] = temp ; 
                }
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotate(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
    }
}