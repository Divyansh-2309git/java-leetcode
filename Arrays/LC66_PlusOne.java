/*
 * Problem: LC 66 - Plus One
 *
 * Topic: Arrays
 * Pattern: Carry Propagation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Iterate from right to left.
 * - If digit < 9, increment and return.
 * - Otherwise set digit to 0 and propagate carry.
 * - If loop finishes, create new array of size n+1 with index 0 set to 1.
 *
 * Key Learning:
 * - Reverse traversal for digit carry handling.
 *
 * Date Solved: 01-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC66_PlusOne {

    static class Solution {
        public int[] plusOne(int[] digits) {
            int carr = 0 ; 
            for (int i = digits.length -1 ; i >= 0 ; i--){
                if(digits[i] < 9 ){
                    digits[i] = digits[i] + 1 ; 
                    carr = 0 ; 
                    break ; 
                }else{
                    digits[i] = 0 ; 
                    carr = 1 ; 
                }
            } 
            if(carr == 1 ){
                int[] ans = new int[digits.length + 1 ] ; 
                ans[0] = 1 ; 
                for(int i = 1 ; i < ans.length ; i ++){
                    ans[i] = digits[i -1 ] ; 
                }
                return ans ; 
            }else{
                return digits ; 
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] digits1 = {1, 2, 3};
        print(solution.plusOne(digits1));   // [1,2,4]

        int[] digits2 = {4, 3, 2, 1};
        print(solution.plusOne(digits2));   // [4,3,2,2]

        int[] digits3 = {9};
        print(solution.plusOne(digits3));   // [1,0]

        int[] digits4 = {9, 9, 9};
        print(solution.plusOne(digits4));   // [1,0,0,0]

    }

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}