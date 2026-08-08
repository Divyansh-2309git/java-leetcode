/*
 * Problem: LC 167 - Two Sum II - Input Array Is Sorted
 *
 * Topic:Arrays
 * Pattern:Two Pointers
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Place one pointer at the beginning and one at the end of the sorted array.
 * Compare their sum with the target.
 * If the sum is too large, move the right pointer left.
 * If the sum is too small, move the left pointer right.
 * Continue until the target sum is found
 *
 * Key Learning:
 * A sorted array allows eliminating impossible candidates by moving
 * one pointer at a time instead of checking every pair.
 *
 * Date Solved:31-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
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