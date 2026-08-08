/*
 * Problem: LC 387 - First Unique Character in a String
 *
 * Topic: String, Hashing
 * Pattern: Frequency Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Create a HashMap to count the frequency of every character.
 * - Traverse the string once and build the frequency map.
 * - Traverse the string a second time.
 * - Return the index of the first character whose frequency is 1.
 * - If no unique character exists, return -1.
 *
 * Key Learning:
 * - Frequency counting is useful for identifying unique elements.
 * - Sometimes a second traversal is simpler and cleaner than trying
 *   to solve everything in one pass.
 * - getOrDefault() simplifies frequency counting.
 *
 * Date Solved: 07-08-2026
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