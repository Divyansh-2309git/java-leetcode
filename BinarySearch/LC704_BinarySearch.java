/*
 * Problem: LC 704 - Binary Search
 *
 * Topic: Binary Search
 * Pattern: Standard Binary Search
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Maintain a search range using left and right pointers.
 * - Calculate the middle index.
 * - If nums[mid] equals the target, return mid.
 * - If target is greater than nums[mid], search the right half.
 * - Otherwise, search the left half.
 * - Return -1 if the target is not found.
 *
 * Key Learning:
 * - Standard binary search template.
 * - The search space is reduced by half after every iteration.
 * - Use left + (right - left) / 2 to safely calculate mid.
 *
 * Date Solved: 10-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC704_BinarySearch {

    static class Solution {
        public int search(int[] nums, int target) {

            int left = 0 ; 
            int right = nums.length - 1 ; 

            while(left <= right){
                int mid = left + (right - left ) / 2 ; 

                if(target == nums[mid]){
                    return mid ; 
                }
                else if(target > nums[mid]){
                    left = mid + 1 ; 
                }
                else{
                    right = mid - 1 ; 
                }

            }

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums1, 9));
        // Expected: 4

        // Test Case 2
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums2, 2));
        // Expected: -1

        // Test Case 3
        int[] nums3 = {5};
        System.out.println(solution.search(nums3, 5));
        // Expected: 0

        // Test Case 4
        int[] nums4 = {5};
        System.out.println(solution.search(nums4, -5));
        // Expected: -1

        // Test Case 5
        int[] nums5 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(solution.search(nums5, 13));
        // Expected: 6
    }
}