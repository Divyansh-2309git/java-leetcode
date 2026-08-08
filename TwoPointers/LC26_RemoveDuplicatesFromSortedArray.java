/*
 * Problem: LC 26 - Remove Duplicates from Sorted Array
 *
 * Topic: Arrays
 * Pattern: Two Pointers 
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(n)
 *
 * Approach:
 * Maintain a write pointer for the last unique element.
 * Traverse the array with a read pointer.
 * Whenever a new unique element is found, move the write pointer
 * forward and overwrite that position with the new element.
 *
 * Key Learning:
 * In a sorted array, duplicates are adjacent.
 * Comparing the current element with the last unique element
 * allows duplicates to be removed in-place.
 *
 * Date Solved:31-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
  *
 * Revision: No
 */

import java.util.Arrays;

public class LC26_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int left = 0 ; 
        for (int i = 1 ; i < nums.length ; i ++){
            if(nums[left] != nums[i] ){
                left ++; 
                nums[left] = nums[i] ; 
            }
        }
        return left + 1 ; 

    }

    public static void main(String[] args) {

        LC26_RemoveDuplicatesFromSortedArray solution =
                new LC26_RemoveDuplicatesFromSortedArray();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }
}