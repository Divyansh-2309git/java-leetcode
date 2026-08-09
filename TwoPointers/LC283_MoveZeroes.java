/*
 * Problem: LC 283 - Move Zeroes
 *
 * Topic: Two Pointers
 * Pattern: Read & Write Pointers / Swapping
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Write pointer tracks zero position, swapping with non-zero elements encountered by read pointer.
 *
 * Key Learning:
 * - In-place swapping while maintaining relative order of non-zero elements.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.Arrays;

public class LC283_MoveZeroes {

    public void moveZeroes(int[] nums) {
            int right = 0 ; 
            for (int left = 0 ; left < nums.length ; left ++){
                if(nums[left] != 0 ){
                    int temp = nums[left] ; 
                    nums[left] = nums[right] ; 
                    nums[right] = temp ; 
                    right ++ ; 
                }
            }
    }

    public static void main(String[] args) {

        LC283_MoveZeroes solution = new LC283_MoveZeroes();

        int[] nums = {0, 1, 0, 3,0, 12};

        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}