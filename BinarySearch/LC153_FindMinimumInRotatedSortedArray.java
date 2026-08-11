/*
 * Problem: LC 153 - Find Minimum in Rotated Sorted Array
 *
 * Topic: Binary Search
 * Pattern: Binary Search on Rotated Sorted Array
 * Difficulty: Medium
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Maintain a search range using left and right pointers.
 * - Compare nums[mid] with nums[right] to determine which half contains
 *   the minimum.
 * - If nums[mid] > nums[right], the minimum must be to the right of mid.
 * - Otherwise, the minimum is at mid or somewhere to its left.
 * - Continue until left == right.
 * - nums[left] is the minimum element.
 *
 * Key Learning:
 * - Use nums[mid] and nums[right] to identify the unsorted/rotated portion.
 * - Use right = mid instead of right = mid - 1 because mid can be the minimum.
 * - Use while (left < right) because we are narrowing the search to one element.
 *
 * Date Solved: 10-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */


public class LC153_FindMinimumInRotatedSortedArray {

    static class Solution {
        public int findMin(int[] nums) {
            int left = 0 ; 
            int right = nums.length - 1 ; 
            while(left < right) {
                int mid = left + (right - left ) / 2 ;
                if(nums[mid] > nums[right]){
                    left = mid + 1 ; 
                }else{
                    right = mid ; 
                }
            }
            
            return nums[left];
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums1));
        // Expected: 1

        // Test Case 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.findMin(nums2));
        // Expected: 0

        // Test Case 3
        int[] nums3 = {11, 13, 15, 17};
        System.out.println(solution.findMin(nums3));
        // Expected: 11

        // Test Case 4
        int[] nums4 = {2, 1};
        System.out.println(solution.findMin(nums4));
        // Expected: 1
    }
}