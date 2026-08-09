/*
 * Problem: LC 205 - Isomorphic Strings
 *
 * Topic: Hashing
 * Pattern: Bijective Map Validation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Maintain two HashMaps or character arrays to ensure one-to-one character mapping in both directions.
 *
 * Key Learning:
 * - Bijective mapping requires validating mapping from s -> t AND t -> s.
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐
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