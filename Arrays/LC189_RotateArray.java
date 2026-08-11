/*
 * Problem: LC 189 - Rotate Array
 *
 * Topic: Arrays
 * Pattern: Array Manipulation / Reversal
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Normalize k using k % n to handle cases where k > n.
 * - Reverse the entire array.
 * - Reverse the first k elements.
 * - Reverse the remaining n-k elements.
 * - All reversals are performed in-place using swapping.
 *
 * Key Learning:
 * - An array can be rotated in-place using the reversal technique.
 * - Three reversals can rearrange two sections of an array without extra space.
 * - k % n handles rotations larger than the array length.
 *
 * Date Solved: 09-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC189_RotateArray {

    static class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length ; 
            for(int i = 0 ; i < n / 2 ; i ++){
                int temp = nums[i] ; 
                nums[i] = nums[n - i -1] ; 
                nums[n - i - 1] = temp ; 
            }

            for(int i = 0 ; i < k/2 ; i ++){
                int temp = nums[i] ; 
                nums[i] = nums[k - i - 1] ; 
                nums[k - i - 1] = temp ; 
            }
            int left = k;
            int right = n - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1));
        // [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {-1, -100, 3, 99};
        solution.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2));
        // [3, 99, -1, -100]
    }
}