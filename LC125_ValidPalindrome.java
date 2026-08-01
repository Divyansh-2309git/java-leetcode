/*
 * Problem: LC 125 - Valid Palindrome
 *
 * Topic: Strings
 * Pattern: Two Pointers (Opposite Ends)
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Use two pointers starting from both ends of the string.
 * Skip non-alphanumeric characters.
 * Compare lowercase versions of valid characters.
 * If a mismatch is found, return false.
 * Otherwise continue until the pointers meet.
 *
 *
 * Key Learning:
 * Two pointers can process strings in-place while skipping
 * unwanted characters, avoiding the need to build a new string.
 *
 * Date Solved:31-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 * 
 * Revesion Needed : No 
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