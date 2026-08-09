/*
 * Problem: LC 485 - Max Consecutive Ones
 *
 * Topic: Arrays
 * Pattern: Running Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Track current consecutive 1s count and maximum consecutive 1s count seen so far.
 * - Reset current count when a 0 is encountered.
 *
 * Key Learning:
 * - Resetting running count on state change.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
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