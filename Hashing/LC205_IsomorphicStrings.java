/*
 * Problem: LC 205 - Isomorphic Strings
 *
 * Topic: String, Hashing
 * Pattern: Hash Map
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Create two HashMaps:
 *      1. s -> t mapping
 *      2. t -> s mapping
 * - Traverse both strings simultaneously.
 * - If a mapping already exists, verify that it matches the current character.
 * - If either mapping is inconsistent, return false.
 * - Otherwise, store the new mappings.
 * - If the traversal completes without conflicts, return true.
 *
 * Key Learning:
 * - Some problems require a one-to-one (bijective) mapping.
 * - A single HashMap only guarantees one-directional mapping.
 * - Using two HashMaps ensures both forward and reverse mappings remain consistent.
 * - Verify mappings while inserting instead of checking afterward.
 *
 * Date Solved: 06-08-2026
 *
 * Confidence: ⭐⭐⭐⭐☆
 *
 * Revision: Yes
 */

import java.util.HashMap;

public class LC205_IsomorphicStrings {

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character>  map  = new HashMap<>() ; 
            HashMap<Character, Character>  map2  = new HashMap<>() ; 
            

            for(int i = 0 ; i < s.length() ; i ++){
                char chS = s.charAt(i) ; 
                char chT = t.charAt(i) ; 

                if(map.containsKey(chS) && map.get(chS) != chT){
                    return false ; 
                }

                if(map2.containsKey(chT) && map2.get(chT) != chS){
                    return false ; 
                }
                map.put(chS , chT) ; 
                map2.put(chT , chS) ; 

            }
            
            return true;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.isIsomorphic("egg", "add"));

        // Test Case 2
        System.out.println(solution.isIsomorphic("foo", "bar"));

        // Test Case 3
        System.out.println(solution.isIsomorphic("paper", "title"));

    }
}