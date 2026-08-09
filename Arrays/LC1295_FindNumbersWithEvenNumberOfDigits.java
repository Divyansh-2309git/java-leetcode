/*
 * Problem: LC 1295 - Find Numbers with Even Number of Digits
 *
 * Topic: Arrays
 * Pattern: Digit Manipulation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Traverse through the array.
 * - Count the number of digits of each number using division by 10 or log10.
 * - Increment counter if the digit count is even.
 *
 * Key Learning:
 * - Digits can be counted using logarithmic scaling or repetitive division.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC1295_FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0 ; 
        for (int num : nums){
            if(hasEvenDigits(num)){
                count ++ ; 
            }
        }
        return count ; 
    }
    private boolean hasEvenDigits(int num){
        int digits = 0 ; 
        while(num > 0 ){
            digits ++ ; 
            num /= 10 ; 
        }
        return digits % 2 == 0 ; 
    }

    public static void main(String[] args) {

        LC1295_FindNumbersWithEvenNumberOfDigits solution =
                new LC1295_FindNumbersWithEvenNumberOfDigits();

        int[] nums = {12, 345, 2, 6, 7896};

        int ans = solution.findNumbers(nums);

        System.out.println(ans);
    }
}