/*
 * Problem: LC 75 - Sort Colors
 *
 * Topic: Arrays
 * Pattern: Dutch National Flag / Three Pointers
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Use three pointers: left, mid, and right.
 * - Maintain 0s on the left, 1s in the middle, and 2s on the right.
 * - If nums[mid] is 0, swap it with nums[left] and move both left and mid.
 * - If nums[mid] is 1, only move mid forward.
 * - If nums[mid] is 2, swap it with nums[right] and move right backward.
 * - Do not move mid after swapping a 2 because the newly swapped element has not been examined yet.
 *
 * Key Learning:
 * - The Dutch National Flag algorithm sorts three distinct values in one pass.
 * - Multiple pointers can divide an array into processed and unprocessed regions.
 * - When swapping an unprocessed element into the current position, it must be checked before moving forward.
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

public class LC75_SortColors {

    static class Solution {
        public void sortColors(int[] nums) {
            int l = 0 ; 
            int m = 0 ; 
            int r = nums.length - 1 ; 
            while(m <=r ){
                if (nums[m] == 0 ){
                    int temp = nums[l]; 
                    nums[l] = nums[m]; 
                    nums[m] = temp ; 
                    l ++ ; 
                    m ++ ; 

                }
                else if (nums[m] == 1){
                    m ++ ;
                }
                else{
                    int temp = nums[r] ; 
                    nums[r] = nums[m];
                    nums[m] = temp; 
                    r -- ;   
                }
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
        // [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
        // [0, 1, 2]

        int[] nums3 = {0};
        solution.sortColors(nums3);
        System.out.println(Arrays.toString(nums3));
        // [0]
    }
}