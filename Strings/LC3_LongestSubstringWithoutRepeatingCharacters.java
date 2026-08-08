
/*
 * Problem: LC 3 - Longest Substring Without Repeating Characters
 *
 * Topic: String, HashSet
 * Pattern: Sliding Window
 * Difficulty: Medium
 *
 * Time Complexity:
 * Space Complexity:
 *
 * Approach:
 * - Attempted using a HashSet and a current substring.
 * - Realized that clearing the entire set when a duplicate is found
 *   loses part of the valid substring.
 * - Learned that the correct approach uses a Sliding Window with
 *   left and right pointers.
 * - Deferred the problem because Sliding Window has not been learned yet.
 *
 * Key Learning:
 * - A duplicate does not mean the entire current window is invalid.
 * - The window should be shrunk from the left until the duplicate
 *   is removed.
 * - HashSet can be used to track characters currently inside the window.
 *
 * Date Attempted: 09-08-2026
 *
 * Status: ⏸️ Deferred
 *
 * Reason:
 * - Sliding Window pattern has not been learned yet.
 *
 * Revision: Yes - after learning Sliding Window
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