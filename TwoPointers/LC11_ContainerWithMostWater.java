/*
 * Problem: LC 11 - Container With Most Water
 *
 * Topic: Arrays
 * Pattern: Two Pointers
 * Difficulty: Medium
 *
 * Approach:
 * - Start with two pointers at both ends of the array.
 * - Calculate the area using the shorter of the two heights.
 * - Update the maximum area.
 * - Move the pointer pointing to the shorter height.
 * - Continue until the pointers meet.
 *
 * Key Learning:
 * - The shorter height limits the amount of water.
 * - Moving the taller pointer cannot improve the area because
 *   the width decreases while the limiting height remains the same.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC11_ContainerWithMostWater {

    static class Solution {
        public int maxArea(int[] height) {
            int left = 0 ; 
            int right = height.length - 1 ; 
            int maxWater = 0 ; 
            while(left < right){
                int currArea = (Math.min(height[right] , height[left])) * (right - left) ; 
                maxWater = Math.max(currArea , maxWater) ; 
                if(height[right] > height[left]){
                    left ++ ; 
                }else{
                    right -- ; 
                }
                
            }
            return maxWater ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height1));
        // Expected: 49

        // Test Case 2
        int[] height2 = {1, 1};
        System.out.println(solution.maxArea(height2));
        // Expected: 1

        // Test Case 3
        int[] height3 = {1, 2, 1};
        System.out.println(solution.maxArea(height3));
        // Expected: 2
    }
}