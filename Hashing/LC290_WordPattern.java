/*
 * Problem: LC 290 - Word Pattern
 *
 * Topic: Hashing
 * Pattern: Bijective Map Validation
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Split string into words.
 * - Check length equality with pattern and maintain two-way mapping char <-> word.
 *
 * Key Learning:
 * - Bijective word to character mapping logic.
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashMap;

public class LC290_WordPattern {

    static class Solution {
        public boolean wordPattern(String pattern, String s) {
            HashMap<Character , String > map1 = new HashMap<>() ; 
            HashMap<String , Character > map2 = new HashMap<>() ; 
            String[] words = s.split(" ") ; 

            for(int i = 0 ; i < pattern.length() ; i ++){
                
                char ch = pattern.charAt(i) ; 
                String word = words[i] ; 
                if(map1.containsKey(ch) && !map1.get(ch).equals(word)){
                    return false ; 
                }
                if(map2.containsKey(word) && map2.get(word) != ch){
                    return false ; 
                }

                map1.put(ch , word) ; 
                map2.put(word , ch) ; 
            }
            return true ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));

        // Test Case 2
        // System.out.println(solution.wordPattern("abba", "dog cat cat fish"));

        // Test Case 3
        // System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));

    }
}