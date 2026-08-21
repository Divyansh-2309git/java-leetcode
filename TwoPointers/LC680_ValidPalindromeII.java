/*
 * Problem: LC 680 - Valid Palindrome II
 *
 * Topic: Strings
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Approach:
 * - Use two pointers from both ends of the string.
 * - Move inward while the characters match.
 * - At the first mismatch, there are two possibilities:
 *   1. Remove the left character.
 *   2. Remove the right character.
 * - Check whether either remaining substring is a palindrome.
 *
 * Key Learning:
 * - At the first mismatch, don't make a greedy choice.
 * - Both possible deletions need to be checked.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) auxiliary
 *
 * Date Solved: 16-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC680_ValidPalindromeII {

    static class Solution {
        public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
}
        boolean isPalindrome(String s, int left, int right) {
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        return false;
                    }

                    left++;
                    right--;
                }

                return true;
        }
        
        
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "aba";
        System.out.println(solution.validPalindrome(s1));
        // Expected: true

        // Test Case 2
        String s2 = "abca";
        System.out.println(solution.validPalindrome(s2));
        // Expected: true

        // Test Case 3
        String s3 = "abc";
        System.out.println(solution.validPalindrome(s3));
        // Expected: false

        // Test Case 4
        String s4 = "deeee";
        System.out.println(solution.validPalindrome(s4));
        // Expected: true
    }
}