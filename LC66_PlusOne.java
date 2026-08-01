/*
 * Problem: LC 66 - Plus One
 *
 * Topic:Arrays
 * Pattern:Carry Propogation
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1) / O(n) (when the new array is created) 
 *
 * Approach:
 * Traverse the array from right to left.
 * If a digit is less than 9, increment it and return.
 * Otherwise, set it to 0 and continue carrying.
 * If every digit becomes 0, create a new array of size n+1
 * with the first element as 1.
 *
 * Key Learning:
 * Arrays are fixed size. Create a new array only when
 * the number of digits increases.
 *
 * Date Solved:1-8-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 * 
 * Revision needed : No r
 *
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