/*
 * Problem: LC 27 - Remove Element
 *
 * Topic: Two Pointers
 * Pattern: Read & Write Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Read pointer traverses array; write pointer stores elements not matching target val.
 *
 * Key Learning:
 * - In-place element removal without extra array allocation.
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

public class LC27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int left = 0 ; 
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] != val){
                nums[left] = nums[i] ;
                left ++ ; 
            }
        }
        return left ; 
        
    }

    public static void main(String[] args) {

        LC27_RemoveElement solution = new LC27_RemoveElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }
}