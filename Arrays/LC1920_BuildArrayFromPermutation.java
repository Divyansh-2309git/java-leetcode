/*
 * Problem: LC 1920 - Build Array from Permutation
 *
 * Topic: Arrays
 * Pattern: Array Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Construct a new array ans where ans[i] = nums[nums[i]].
 *
 * Key Learning:
 * - Direct index referencing with input values.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.* ; 
public class LC1920_BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length] ; 
        for (int i = 0 ; i < nums.length ; i ++){
            ans[i] = nums[nums[i]] ; 
        }
        return ans ; 
    }
    public static void main(String[] args) {
        LC1920_BuildArrayFromPermutation solution =
                new LC1920_BuildArrayFromPermutation();

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ans = solution.buildArray(nums);

        System.out.println(Arrays.toString(ans));

    }

}