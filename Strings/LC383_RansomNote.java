/*
 * Problem: LC 383 - Ransom Note
 *
 * Topic: Strings
 * Pattern: Frequency Count
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Count available letters from magazine and decrement when consuming for ransom note.
 *
 * Key Learning:
 * - Character inventory tracking using frequency maps.
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

public class LC383_RansomNote {

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character , Integer > map= new HashMap<>() ; 
            HashMap<Character , Integer > map2 = new HashMap<>() ; 
            for(int i = 0 ; i < magazine.length() ; i ++){
                char ch = magazine.charAt(i) ; 
                map.putIfAbsent(ch, 0) ; 
                map.put(ch , map.get(ch) + 1 ) ; 
            }
            for(int i = 0 ; i < ransomNote.length() ; i ++){
                char val = ransomNote.charAt(i) ; 
                if(map.containsKey(val)){
                    if(map.get(val) == 1){
                        map.remove(val) ; 
                    }else{
                        map.put(val , map.get(val) - 1) ; 
                    }

                }else{
                    return false ; 
                }
            }
            return true ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.canConstruct("a", "b"));                 // false

        // Test Case 2
        System.out.println(solution.canConstruct("aa", "ab"));               // false

        // Test Case 3
        System.out.println(solution.canConstruct("aa", "aab"));              // true

        // Test Case 4
        System.out.println(solution.canConstruct("abc", "cbad"));            // true

        // Test Case 5
        System.out.println(solution.canConstruct("hello", "lloehworld"));    // true
    }
}