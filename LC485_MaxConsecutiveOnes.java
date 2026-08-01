/*
 * Problem: LC 485 - Max Consecutive Ones
 *
 * Topic: Arrays
 * Pattern: Running count 
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Traverse the array once.
 * Increase the current streak when a 1 is found.
 * Reset the streak when a 0 is found.
 * Keep track of the maximum streak encountered.
 *
 * Key Learning:
 *
 * Date Solved:30-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 */

public class LC485_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0 ; 
        int currCount = 0 ; 
        for (int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 1 ){
                currCount ++ ; 
                maxCount = Math.max(currCount , maxCount) ; 

            }else{
                currCount = 0 ; 
            }
            
        }
        return maxCount ; 
    }

    public static void main(String[] args) {

        LC485_MaxConsecutiveOnes solution =
                new LC485_MaxConsecutiveOnes();

        int[] nums = {1, 1, 0, 1, 1, 1 , 1};

        int ans = solution.findMaxConsecutiveOnes(nums);

        System.out.println(ans);
    }
}