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
 * Approach:
 * - Create an array of size 2n.
 * - Copy elements of nums into ans[i] and ans[i + n].
 *
 * Key Learning:
 * - Array duplication and offset indexing.
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