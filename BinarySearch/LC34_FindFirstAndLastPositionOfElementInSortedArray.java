/*
 * Problem: LC 34 - Find First and Last Position of Element in Sorted Array
 *
 * Topic: Binary Search
 * Pattern: Binary Search Boundary / First and Last Occurrence
 * Difficulty: Medium
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Perform binary search twice on the sorted array.
 * - First pass searches for the leftmost (first) occurrence: when nums[mid] == target, record index and continue searching left (right = mid - 1).
 * - Second pass searches for the rightmost (last) occurrence: when nums[mid] == target, record index and continue searching right (left = mid + 1).
 * - Return [first, last], or [-1, -1] if target is not found.
 *
 * Key Learning:
 * - Binary search can be adapted to find first or last occurrence by continuing search into adjacent boundary half upon matching.
 * - Two independent O(log n) passes maintain O(log n) total runtime and O(1) extra space.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: TODO: USER INPUT REQUIRED
 */

import java.util.*;

public class LC34_FindFirstAndLastPositionOfElementInSortedArray {

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0 ; 
            int right = nums.length - 1 ; 
            int[] ans = new int[]{-1, -1} ; 
            while(left <= right){
                int mid = left + (right - left) / 2 ; 
                
                if(nums[mid] == target){
                    ans[0] = mid ; 
                    right = mid - 1 ; 
                }
                else if(nums[mid] > target){
                    right = mid - 1 ; 
                }else{
                    left = mid + 1 ; 
                }
            }
            left = 0 ; 
            right = nums.length - 1 ; 
            while(left <= right){
                int mid = left + (right - left) / 2 ; 
                
                if(nums[mid] == target){
                    ans[1] = mid ; 
                    left = mid + 1 ; 
                }
                else if(nums[mid] > target){
                    right = mid - 1 ; 
                }else{
                    left = mid + 1 ; 
                }
            }
            
            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {5, 7, 7, 8, 8 , 8 , 8 , 8 , 8, 8 , 8 , 8 , 8 , 8, 10};
        System.out.println(
                Arrays.toString(solution.searchRange(nums1, 8))
        );
        // Expected: [3, 4]

        // Test Case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        System.out.println(
                Arrays.toString(solution.searchRange(nums2, 6))
        );
        // Expected: [-1, -1]

        // Test Case 3
        int[] nums3 = {1};
        System.out.println(
                Arrays.toString(solution.searchRange(nums3, 1))
        );
        // Expected: [0, 0]

        // Test Case 4
        int[] nums4 = {2, 2, 2, 2, 2};
        System.out.println(
                Arrays.toString(solution.searchRange(nums4, 2))
        );
        // Expected: [0, 4]
    }
}