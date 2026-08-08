/*
 * Problem: LC 1920 - Build Array from Permutation
 *
 * Topic: Arrays
 * Pattern: Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 *
 * Approach:Approach:
 * Create a new array of the same length.
 * Traverse the input array once and assign
 * ans[i] = nums[nums[i]].
 *
 * Recognition:
 * Use when:
 *          -Array values can be used as indices.
 *          - Need to construct another array from index mapping.
 * 
 * Key Learning:Practice using array values as indices 
 *
 * Date Solved:30-7-2026
 * 
 * Confidence = ⭐⭐⭐⭐⭐
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