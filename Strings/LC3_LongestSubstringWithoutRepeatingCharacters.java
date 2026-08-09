/*
 * Problem: LC 3 - Longest Substring Without Repeating Characters
 *
 * Topic: Strings
 * Pattern: Sliding Window
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(m, n))
 *
 * Approach:
 * - Sliding window with left and right pointers using HashSet/HashMap to track window characters.
 *
 * Key Learning:
 * - Sliding window dynamic expansion and contraction.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: ⏸️ Deferred
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: Yes
 */

import java.util.HashSet;




public class LC3_LongestSubstringWithoutRepeatingCharacters {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>() ; 
            String curr = "" ; 
            String maxString = "" ; 
            int left = 0;
            for(int i = 0 ; i < s.length() ; i ++){
                char ch = s.charAt(i) ; 
                
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left)) ; 
                    left ++ ; 
                }
                
                curr += String.valueOf(ch) ; 
                set.add(ch) ; 
                
                if(curr.length() > maxString.length()){
                    maxString = curr ; 
                }

            }
            
            return maxString.length();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(
                solution.lengthOfLongestSubstring("abcabcbb")
        ); // 3

        // Test Case 2
        System.out.println(
                solution.lengthOfLongestSubstring("bbbbb")
        ); // 1

        // Test Case 3
        System.out.println(
                solution.lengthOfLongestSubstring("pwwkew")
        ); // 3

        // Test Case 4
        System.out.println(
                solution.lengthOfLongestSubstring("")
        ); // 0
    }
}