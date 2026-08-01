/*
 * Problem: LC 1929 - Concatenation of Array
 *
 * Topic: Arrays
 * Pattern: Array Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:reate an array of size 2n and traverse it once.
 * Use i % n so that after reaching the end of the original array,
 * the index wraps around and starts again from the beginning.
 *
 * Key Learning: Modulo (%) can be used to cycle through an array repeatedly.
 *
 * Date Solved:30-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 */

import java.util.Arrays;

public class LC1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length ; 
        int[] ans = new int[2 * n ] ; 
        for (int i = 0 ; i < 2 * n ; i ++){
            ans[i] = nums[i % n ] ;   
        }
        return ans ; 
    }

    public static void main(String[] args) {

        LC1929_ConcatenationOfArray solution =
                new LC1929_ConcatenationOfArray();

        int[] nums = {1, 2, 3 ,1};

        int[] ans = solution.getConcatenation(nums);

        System.out.println(Arrays.toString(ans));
    }
}