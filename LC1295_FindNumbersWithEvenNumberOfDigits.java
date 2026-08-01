/*
 * Problem: LC 1295 - Find Numbers with Even Number of Digits
 *
 * Topic: Arrays
 * Pattern:Digit Manipulation 
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity:O(1)
 *
 * Approach:Traverse every number.
 * Count its digits by repeatedly dividing by 10.
 * If the digit count is even, increment the answer.
 *
 * Key Learning: Repeated division by 10 is a simple way to determine the number of digits without converting to a String.
 *
 * Date Solved: 30-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
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