/*
 * Problem: LC 977 - Squares of a Sorted Array
 *
 * Topic: Arrays
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Approach:
 * - Use two pointers, one at the beginning and one at the end.
 * - Compare the squares of both values.
 * - The larger square belongs at the current position from the end
 *   of the result array.
 * - Move the pointer that produced the larger square.
 * - Continue until both pointers meet.
 *
 * Key Learning:
 * - In a sorted array containing negative and positive values,
 *   the largest square can come from either end.
 * - Filling the result array from right to left allows us to
 *   maintain sorted order without sorting the squared values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC977_SquaresOfASortedArray {

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] ans = new int[nums.length] ; 
            int left = 0 ; 
            int right = nums.length - 1 ; 
            int index = nums.length - 1 ; 
            while(left <= right){
                int sqLeft = nums[left] * nums[left] ; 
                int sqRight = nums[right] * nums[right] ; 
                ans[index] = Math.max(sqLeft , sqRight) ; 
                if(sqLeft > sqRight){
                    left ++ ; 
                }else{
                    right -- ; 
                }
                index -- ; 
            }
            return ans ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = solution.sortedSquares(nums1);

        for(int num : result1){
            System.out.print(num + " ");
        }
        System.out.println();
        // Expected: 0 1 9 16 100

        // Test Case 2
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = solution.sortedSquares(nums2);

        for(int num : result2){
            System.out.print(num + " ");
        }
        System.out.println();
        // Expected: 4 9 9 49 121
    }
}