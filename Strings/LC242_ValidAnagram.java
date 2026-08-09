/*
 * Problem: LC 242 - Valid Anagram
 *
 * Topic: Strings
 * Pattern: Frequency Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Count character frequencies and compare.
 *
 * Key Learning:
 * - Fixed-size integer array int[26] frequency counting.
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC242_ValidAnagram {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character , Integer> map = new HashMap<>() ; 
            for(int i = 0 ; i < s.length() ; i ++){
                char val = s.charAt(i) ; 
                map.put(val , map.getOrDefault(val, 0) + 1 ) ; 
            }

            for(int i = 0 ; i < t.length() ; i ++){
                char val = t.charAt(i) ; 
                if(map.containsKey(val)){
                    if(map.get(val) == 1){
                        map.remove(val) ; 
                    }else{
                        map.put(val , map.get(val) -1 ) ; 
                    }
                }else{
                    return false ; 
                }

            }
            return map.isEmpty() ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.isAnagram("anagram", "nagaram"));

        // Test Case 2
        System.out.println(solution.isAnagram("rat", "car"));

        // Test Case 3
        System.out.println(solution.isAnagram("", ""));
    }
}