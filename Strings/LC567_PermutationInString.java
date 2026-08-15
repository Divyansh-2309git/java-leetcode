/*
 * Problem: LC 567 - Permutation in String
 *
 * Topic: Strings
 * Pattern: Fixed-Size Sliding Window + Frequency Map
 * Difficulty: Medium
 *
 * Approach:
 * - The length of every permutation of s1 is exactly s1.length().
 * - Therefore, maintain a fixed-size window of size s1.length()
 *   inside s2.
 * - Create a frequency map for the characters of s1.
 * - Create another frequency map for the current window of s2.
 * - Compare the two maps.
 * - If they are equal, the current window is a permutation of s1.
 * - If they are not equal, slide the window:
 *      1. Remove the character leaving the window.
 *      2. Add the character entering the window.
 *      3. Compare the frequency maps again.
 * - Return true as soon as a matching frequency map is found.
 * - If no window matches, return false.
 *
 * Window Size:
 *
 *     s1.length()
 *
 * Example:
 *
 * s1 = "ab"
 * s2 = "eidbaooo"
 *
 * First window:
 *
 *     [e i]
 *
 * Frequencies:
 *
 *     s1:
 *     a -> 1
 *     b -> 1
 *
 *     window:
 *     e -> 1
 *     i -> 1
 *
 * Not equal.
 *
 * Slide:
 *
 *     e [i d]
 *
 * Remove 'e'
 * Add 'd'
 *
 * Still not equal.
 *
 * Continue:
 *
 *     e i [d b]
 *     e i d [b a]
 *
 * Window "ba" has:
 *
 *     b -> 1
 *     a -> 1
 *
 * Which is equal to the frequency map of "ab".
 *
 * Therefore:
 *
 *     return true;
 *
 * Important Window Formula:
 *
 *     outgoing character:
 *     s2.charAt(right - s1.length())
 *
 *     incoming character:
 *     s2.charAt(right)
 *
 * Window Movement:
 *
 *     Remove outgoing character
 *             ↓
 *     If frequency becomes 0, remove it from map
 *             ↓
 *     Add incoming character
 *             ↓
 *     Compare maps
 *             ↓
 *     Move right
 *
 * Key Learning:
 * - A permutation has exactly the same character frequencies as
 *   the original string.
 * - The order of characters does not matter.
 * - Therefore, frequency maps can be used to compare permutations.
 * - Because every permutation has the same length as s1, a
 *   fixed-size sliding window can be used.
 * - This combines two important patterns:
 *
 *       Fixed-Size Sliding Window
 *                   +
 *              Frequency Map
 *
 * - HashMap.equals() can compare the complete character-frequency
 *   mappings.
 *
 * Edge Case:
 *
 *     if (s1.length() > s2.length()) {
 *         return false;
 *     }
 *
 * There cannot be a permutation of s1 inside s2 if s1 is longer
 * than s2.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * Explanation:
 * - The window moves through s2 only once.
 * - Since the alphabet is limited, the frequency maps contain
 *   only a limited number of characters.
 *
 * Common Mistakes:
 * - Using a variable-size window instead of a fixed-size window.
 * - Forgetting that the window size must equal s1.length().
 * - Removing the incoming character instead of the outgoing one.
 * - Using:
 *
 *       newMap.put(ch, newMap.get(chAtLeft) - 1);
 *
 *   instead of:
 *
 *       newMap.put(chAtLeft, newMap.get(chAtLeft) - 1);
 *
 * - Incrementing right before removing the correct outgoing character.
 * - Forgetting to remove a character from the map when its frequency
 *   becomes 0.
 * - Checking the first window only after sliding.
 * - Forgetting the case where s1 is longer than s2.
 *
 * Date Solved: 14-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import  java.util.*; 
public class LC567_PermutationInString {

    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            HashMap<Character , Integer> oldMap = new HashMap<>() ; 
            HashMap<Character , Integer> newMap = new HashMap<>() ; 
            for(int i = 0 ; i < s1.length() ; i ++){
                char ch = s1.charAt(i) ; 
                oldMap.put(ch , oldMap.getOrDefault(ch, 0) + 1) ; 

            }
            int right = 0 ; 
            for(int i = 0 ; i < s1.length() ; i ++){
                char ch = s2.charAt(i) ; 
                newMap.put(ch , newMap.getOrDefault(ch, 0) + 1) ; 
                right ++ ; 
            }
            if(oldMap.equals(newMap)){
                    return true ; 
            }
            while(right < s2.length()){
                char ch = s2.charAt(right) ; 
                char chAtLeft = s2.charAt(right - s1.length()) ; 
                newMap.put(chAtLeft , newMap.get(chAtLeft) - 1) ; 

                if(newMap.get(chAtLeft) == 0 ){
                    newMap.remove(chAtLeft) ; 
                }

                newMap.put(ch , newMap.getOrDefault(ch, 0) + 1 ) ;  

                if(oldMap.equals(newMap)){
                    return true ; 
                }

               


                right ++ ; 
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(
            solution.checkInclusion(s1, s2)
        );
        // Expected: true


        // Test Case 2
        s1 = "ab";
        s2 = "eidboaoo";

        System.out.println(
            solution.checkInclusion(s1, s2)
        );
        // Expected: false


        // Test Case 3
        s1 = "adc";
        s2 = "dcda";

        System.out.println(
            solution.checkInclusion(s1, s2)
        );
        // Expected: true


        // Test Case 4
        s1 = "hello";
        s2 = "ooolleoooleh";

        System.out.println(
            solution.checkInclusion(s1, s2)
        );
        // Expected: false
    }
}