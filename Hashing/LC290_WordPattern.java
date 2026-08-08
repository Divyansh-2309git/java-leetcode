/*
 * Problem: LC 290 - Word Pattern
 *
 * Topic: String, Hashing
 * Pattern: Hash Map
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Split the input string into an array of words.
 * - If the number of words doesn't match the pattern length, return false.
 * - Create two HashMaps:
 *      1. Character -> Word
 *      2. Word -> Character
 * - Traverse both the pattern and word array simultaneously.
 * - If an existing mapping conflicts in either HashMap, return false.
 * - Otherwise, insert the new mappings.
 * - If no conflicts are found, return true.
 *
 * Key Learning:
 * - A one-to-one (bijective) relationship requires checking mappings in both directions.
 * - String comparison in Java should be done using .equals(), not == or !=.
 * - String.split(" ") converts a sentence into an array of words.
 * - Always validate input sizes before traversing multiple collections together.
 *
 * Date Solved: 06-08-2026
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