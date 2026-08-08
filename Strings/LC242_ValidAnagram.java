/*
 * Problem: LC 242 - Valid Anagram
 *
 * Topic: String, Hashing
 * Pattern: Frequency Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - If the lengths of both strings are different, return false.
 * - Store the frequency of every character from the first string
 *   inside a HashMap.
 * - Traverse the second string and decrease the frequency.
 * - If a character is not present in the HashMap, return false.
 * - Remove the character once its frequency becomes zero.
 * - If all frequencies become zero, the strings are anagrams.
 *
 * Key Learning:
 * - HashMap can be used to maintain character frequencies.
 * - getOrDefault() simplifies frequency counting.
 * - Removing entries with zero frequency keeps the map clean.
 * - Checking string lengths first avoids unnecessary computation.
 *
 * Date Solved: 06-08-2026
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