/*
 * Problem: LC 238 - Product of Array Except Self
 *
 * Topic:Array
 * Pattern:Suffix & Prefix Products
 * Difficulty: Medium
 *
 * Time Complexity:O(n)
 * Space Complexity:O(n)
 *
 * Approach:
 * Build a prefix product array where each index stores the
 * product of all elements to its left.
 *
 * Build a suffix product array where each index stores the
 * product of all elements to its right.
 * 
 *  Multiply the corresponding prefix and suffix products
 * to get the answer for each index.
 * 
 * Key Learning:
 * Prefix and suffix preprocessing.
 *
 * Date Solved:1-8-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 *
  *
 * Revision: No
 */

public class LC238_ProductOfArrayExceptSelf {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length ; 
            int[] right = new int[n] ; 
            int[] left = new int[n] ; 
            right[n-1] = 1 ; 
            left[0] = 1 ; 
            
            for(int i = 1 ; i < n ; i ++){
                left[i] = (left[i - 1] * nums[i - 1] )  ; 
            }

            for(int i = n - 2 ; i >= 0 ; i--){
                right[i] = (right[i + 1 ] * nums[i + 1]); 
            }
            for(int i = 0 ; i < n ; i ++){
                nums[i] = (left[i] * right[i]) ; 
            }
            return nums; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        print(solution.productExceptSelf(nums1));

        int[] nums2 = {-1, 1, 0, -3, 3};
        print(solution.productExceptSelf(nums2));
    }

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}