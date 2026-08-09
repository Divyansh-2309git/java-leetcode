/*
 * Problem: LC 125 - Valid Palindrome
 *
 * Topic: Two Pointers
 * Pattern: Two Pointers (Opposite Ends)
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Two pointers from both ends, skipping non-alphanumeric characters and comparing lowercase values.
 *
 * Key Learning:
 * - In-place string traversal skipping invalid characters.
 *
 * Date Solved: 31-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0 ; 
        int right = s.length() - 1 ; 
        while(left < right){
            if(Character.isLetterOrDigit(s.charAt(right)) && Character.isLetterOrDigit(s.charAt(left))){

                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false ; 
                }
                left ++ ; 
                right -- ;
            }
            else if(Character.isLetterOrDigit(s.charAt(left))){
                right -- ; 
            }else{
                left ++ ; 
            }
             
        }
        return true ; 
    }

    public static void main(String[] args) {

        LC125_ValidPalindrome solution = new LC125_ValidPalindrome();

        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solution.isPalindrome("race a car"));                      // false
        System.out.println(solution.isPalindrome(" "));                               // true
        System.out.println(solution.isPalindrome("0P"));                              // false
    }
}