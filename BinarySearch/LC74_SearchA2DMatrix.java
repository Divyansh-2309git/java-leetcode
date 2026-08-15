/*
 * Problem: LC 74 - Search a 2D Matrix
 *
 * Topic: Binary Search / Matrix
 * Pattern: Binary Search on Virtual 1D Array
 * Difficulty: Medium
 *
 * Time Complexity: O(log(m × n))
 * Space Complexity: O(1)
 *
 * Approach:
 * - Treat the 2D matrix as a sorted 1D array without actually creating a new array.
 * - Perform standard binary search using virtual indices from 0 to (m × n) - 1.
 * - Convert the virtual index into a matrix position using:
 *      row = mid / cols
 *      col = mid % cols
 * - Compare matrix[row][col] with the target and adjust the search range.
 *
 * Key Learning:
 * - A sorted 2D matrix can sometimes be searched as a virtual 1D sorted array.
 * - Division (/) gives the row and modulo (%) gives the column.
 * - Binary search reduces the search space by half after every comparison.
 *
 * Date Solved: 10-08-2026
 *
 * Status: Solved With Assistance
 *
 * Confidence: ⭐⭐⭐
 *
 * Revision: Yes
 */

public class LC74_SearchA2DMatrix {

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int left = 0;
            int right = rows * cols - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                int row = mid / cols;
                int col = mid % cols;

                if (matrix[row][col] == target) {
                    return true;
                }
                else if (matrix[row][col] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println(solution.searchMatrix(matrix, 23));
        // true

        System.out.println(solution.searchMatrix(matrix, 25));
        // false
    }
}
