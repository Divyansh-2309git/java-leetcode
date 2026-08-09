/*
 * Problem: LC 167 - Two Sum II - Input Array Is Sorted
 *
 * Topic: Two Pointers
 * Pattern: Two Pointers (Opposite Ends)
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Opposite end pointers moving inward based on sum comparison with target.
 *
 * Key Learning:
 * - Two pointers on sorted array.
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

public class LC167_TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0 ; 
        int right = numbers.length -1 ; 
        while(left < right){
            int sum = numbers[left] + numbers[right] ; 
            if(sum > target){
                right -- ; 
            }else if(sum < target){
                left ++ ; 
            }else{
                return new int[] {left + 1 , right + 1 } ; 
            }
        }
        return new int[] {0 , 0 } ;
    }

    public static void main(String[] args) {

        LC167_TwoSumII solution = new LC167_TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] ans = solution.twoSum(numbers, target);

        System.out.println(Arrays.toString(ans));
    }
}