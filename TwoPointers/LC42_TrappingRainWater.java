/*
 * Problem: LC 42 - Trapping Rain Water
 *
 * Topic: Arrays
 * Pattern: Prefix/Suffix Maximum Boundaries
 * Difficulty: Hard
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Build a leftBoundary array storing the maximum height
 *   from the left up to each index.
 * - Build a rightBoundary array storing the maximum height
 *   from the right up to each index.
 * - Water at each index =
 *   min(leftBoundary[i], rightBoundary[i]) - height[i].
 *
 * Key Learning:
 * - Water level is determined by the shorter of the
 *   maximum boundaries on both sides.
 *
 * Date Solved: 18-08-2026
 *
 * Status: Solved With Assistance
 *
 * Confidence: ⭐⭐⭐
 *
 * Revision: Yes
 *
 * Note:
 * - Solved using the O(n) space approach.
 * - O(1) space two-pointer approach is pending revision.
 */

public class LC42_TrappingRainWater {

    static class Solution {
        public int trap(int[] height) {
            int n = height.length ; 
            if(n <= 2 ){
                return 0 ; 
            }

            int left = 0 ;  
            int totalWater = 0 ; 
            while(left < n - 1){
                int right = left + 1 ; 
                while(right < n - 1  && height[left] < height[right]) {
                    right ++ ; 
                }
                if(right == n - 1 && height[left] > height[right]){
                    left ++ ; 
                    break ; 
                }
                for(int i = left ; i < right  ; i ++){
                    int waterLevel = Math.min(height[left] , height[right])  ; 
                    totalWater += waterLevel - height[i] ; 
                }
                left ++ ; 
            }
            return totalWater ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] height1 = {
            0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        };

        System.out.println(
            solution.trap(height1)
        );
        // Expected: 6


        // Test Case 2
        int[] height2 = {
            4, 2, 0, 3, 2, 5
        };

        System.out.println(
            solution.trap(height2)
        );
        // Expected: 9
    }
}