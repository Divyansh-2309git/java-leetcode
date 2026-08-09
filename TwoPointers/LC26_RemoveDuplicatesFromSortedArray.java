/*
 * Problem: LC 26 - Remove Duplicates from Sorted Array
 *
 * Topic: Two Pointers
 * Pattern: Read & Write Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Write pointer tracks unique element index; read pointer scans array overwriting duplicate entries.
 *
 * Key Learning:
 * - In-place compaction using read and write pointers.
 *
 * Date Solved: 31-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
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