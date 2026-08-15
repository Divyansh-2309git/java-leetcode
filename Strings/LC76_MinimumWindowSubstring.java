/*
 * Problem: LC 76 - Minimum Window Substring
 *
 * Topic: Strings
 * Pattern: Variable-Size Sliding Window + Frequency Map
 * Difficulty: Hard
 *
 * Approach:
 * - Create a frequency map for the characters required in string t.
 * - Maintain another frequency map for the current sliding window
 *   in string s.
 * - Expand the window by moving right.
 * - When the current window contains all required characters with
 *   the required frequencies, the window becomes valid.
 * - While the window remains valid, shrink it from the left to find
 *   the smallest possible valid window.
 * - Whenever a smaller valid window is found, store its starting
 *   and ending indices.
 * - At the end, return the substring represented by those indices.
 *
 * Required Map:
 *
 *     oldMap
 *
 * Stores the required frequency of every character in t.
 *
 * Example:
 *
 *     t = "AABC"
 *
 *     oldMap:
 *
 *     A -> 2
 *     B -> 1
 *     C -> 1
 *
 * Current Window Map:
 *
 *     newMap
 *
 * Stores the frequency of characters currently inside the window
 * of s.
 *
 * A window is valid when:
 *
 *     newMap contains every character in oldMap
 *
 *     AND
 *
 *     newMap frequency >= oldMap frequency
 *
 * Example:
 *
 *     oldMap = {A=1, B=1, C=1}
 *
 *     newMap = {A=2, B=1, C=3, D=5}
 *
 *     Valid window = true
 *
 * because the window contains at least the required number of
 * A, B, and C characters.
 *
 * Subset Check:
 *
 *     for(char ch : oldMap.keySet()){
 *         if(!newMap.containsKey(ch)
 *                 || newMap.get(ch) < oldMap.get(ch)){
 *             return false;
 *         }
 *     }
 *
 *     return true;
 *
 * Sliding Window Pattern:
 *
 *     Expand right
 *          ↓
 *     Add s[right] to newMap
 *          ↓
 *     Is window valid?
 *          ↓
 *        YES
 *          ↓
 *     Save current window if it is smaller
 *          ↓
 *     Remove s[left]
 *          ↓
 *     left++
 *          ↓
 *     Is window still valid?
 *          ↓
 *        YES
 *          ↓
 *     Continue shrinking
 *
 * Example:
 *
 *     s = "ADOBECODEBANC"
 *     t = "ABC"
 *
 * A valid window is eventually found:
 *
 *     "ADOBEC"
 *
 * It contains A, B and C.
 *
 * Then shrink from the left while the window remains valid.
 *
 * Eventually:
 *
 *     "BANC"
 *
 * is found.
 *
 * "BANC" contains:
 *
 *     A -> 1
 *     B -> 1
 *     C -> 1
 *
 * and is the smallest valid window.
 *
 * Important:
 *
 * When storing the answer:
 *
 *     startValue = left;
 *     endValue = right + 1;
 *
 * The +1 is required because String.substring(start, end)
 * uses an exclusive ending index.
 *
 * Therefore:
 *
 *     s.substring(startValue, endValue)
 *
 * returns the complete window.
 *
 * Key Learning:
 * - This is the capstone variable-size sliding-window problem.
 * - A frequency map can represent both the requirements and the
 *   current window.
 * - For minimum-window problems:
 *
 *       Expand until valid
 *              ↓
 *       Record answer
 *              ↓
 *       Shrink while valid
 *
 * - Unlike maximum-window problems, we want to shrink as much as
 *   possible while keeping the window valid.
 * - The window may contain characters that are not present in t.
 *   Those characters do not make the window invalid.
 * - Character frequencies matter, not just whether a character
 *   exists.
 *
 * Time Complexity:
 * O(n * m)
 *
 * Space Complexity:
 * O(n)
 *
 * Note:
 * - With a fixed-size character set and a more optimized validity
 *   check, the solution can be implemented in O(n).
 * - The current HashMap + isSubset() implementation checks the
 *   required characters repeatedly.
 *
 * Common Mistakes:
 * - Checking newMap keys instead of oldMap keys when checking
 *   whether the window satisfies the requirements.
 * - Checking only whether characters exist instead of comparing
 *   their frequencies.
 * - Using newMap.get(ch) < oldMap.get(ch) incorrectly.
 * - Shrinking the window before recording the current valid window.
 * - Forgetting to update minValue when a smaller window is found.
 * - Forgetting to remove a character from newMap when its frequency
 *   becomes 0.
 * - Using right instead of right + 1 as the substring end index.
 * - Forgetting that substring(start, end) uses an exclusive end.
 * - Returning an invalid substring when no valid window exists.
 *
 * No Valid Window:
 *
 *     if(minValue == Integer.MAX_VALUE){
 *         return "";
 *     }
 *
 * Otherwise:
 *
 *     return s.substring(startValue, endValue);
 *
 * Edge Case:
 *
 * If t is empty:
 *
 *     return "";
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashMap;


public class LC76_MinimumWindowSubstring {

    static class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character , Integer > oldMap = new HashMap<>() ; 
            HashMap<Character , Integer > newMap = new HashMap<>() ; 
            int left = 0 ; 
            int right = 0 ;
            int minValue = Integer.MAX_VALUE ; 
            int startValue = 0 ; 
            int endValue = 0 ;   
            for(int i = 0 ; i < t.length() ; i ++){
                char ch = t.charAt(i) ; 
                oldMap.put(ch , oldMap.getOrDefault(ch, 0) + 1 ) ; 

            }
            while(right < s.length()){
                char ch = s.charAt(right) ; 
                newMap.put(ch , newMap.getOrDefault(ch, 0) + 1 ) ; 
                while(isSubset(newMap, oldMap)){
                    if(minValue > right - left + 1 ) {
                        startValue = left ; 
                        endValue = right + 1; 
                        minValue = right - left + 1 ; 
                    }
                    newMap.put(s.charAt(left) , newMap.get(s.charAt(left)) - 1 ) ; 
                    if(newMap.get(s.charAt(left)) == 0 ){
                        newMap.remove(s.charAt(left)) ; 
                    }
                    left ++ ; 
                }
                right ++ ; 
            }
            if (minValue == Integer.MAX_VALUE) {
                return "";
            }

            
            return s.substring(startValue , endValue);
        }
        boolean isSubset(HashMap<Character , Integer> newMap , HashMap<Character , Integer >oldMap){
            for(char ch : oldMap.keySet()){
                if(!newMap.containsKey(ch) || newMap.get(ch) < oldMap.get(ch)){
                    return false ; 
                }
            }
            return true  ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";

        System.out.println(
            solution.minWindow(s1, t1)
        );
        // Expected: "BANC"


        // Test Case 2
        String s2 = "a";
        String t2 = "a";

        System.out.println(
            solution.minWindow(s2, t2)
        );
        // Expected: "a"


        // Test Case 3
        String s3 = "a";
        String t3 = "aa";

        System.out.println(
            solution.minWindow(s3, t3)
        );
        // Expected: ""


        // Test Case 4
        String s4 = "aa";
        String t4 = "aa";

        System.out.println(
            solution.minWindow(s4, t4)
        );
        // Expected: "aa"
    }
}