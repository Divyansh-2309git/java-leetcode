/*
 * Problem: LC 387 - First Unique Character in a String
 *
 * Topic: Strings
 * Pattern: Frequency Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - First pass counts character frequencies. Second pass returns first character with count 1.
 *
 * Key Learning:
 * - Two-pass string traversal for frequency verification.
 *
 * Date Solved: 07-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashMap;

public class LC387_FirstUniqueCharacterInAString {

    static class Solution {
        public int firstUniqChar(String s) {
            HashMap<Character , Integer > map = new HashMap<>() ; 
            for(int i = 0 ; i < s.length() ; i ++){
                char ch = s.charAt(i) ; 
                map.putIfAbsent(ch, 0) ; 
                map.put(ch , map.get(ch) + 1 ) ; 
            }
            for(int i = 0 ; i < s.length() ;  i++){
                char ch = s.charAt(i) ; 
                if(map.get(ch) == 1 ){
                    return i  ; 
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.firstUniqChar("leetcode"));      // 0

        // Test Case 2
        System.out.println(solution.firstUniqChar("loveleetcode"));  // 2

        // Test Case 3
        System.out.println(solution.firstUniqChar("aabb"));          // -1

        // Test Case 4
        System.out.println(solution.firstUniqChar("z"));             // 0

        // Test Case 5
        System.out.println(solution.firstUniqChar("aabbccd"));       // 6
    }
}