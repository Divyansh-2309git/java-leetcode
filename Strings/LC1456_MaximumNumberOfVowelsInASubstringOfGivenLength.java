/*
 * Problem: LC 1456 - Maximum Number of Vowels in a Substring of Given Length
 *
 * Topic: Strings
 * Pattern: Fixed-Size Sliding Window
 * Difficulty: Medium
 *
 * Approach:
 * - Maintain a window of size k.
 * - First, calculate the number of vowels in the first window.
 * - Store this count as the initial maximum.
 * - Slide the window one character at a time.
 * - When the window moves:
 *      1. Remove the character leaving the window.
 *      2. Add the character entering the window.
 *      3. Update the maximum vowel count.
 * - Since the window size always remains k, this is a fixed-size
 *   sliding window problem.
 *
 * Window Movement:
 *
 * Example:
 * s = "abciiidef"
 * k = 3
 *
 * First window:
 *
 * [a b c] i i i d e f
 *  ↑     ↑
 * left  right
 *
 * vowel count = 1
 *
 * Move window:
 *
 * a [b c i] i i d e f
 *
 * Remove 'a'
 * Add 'i'
 *
 * vowel count = 1
 *
 * Continue:
 *
 * a b [c i i] i d e f
 * 
 * vowel count = 2
 *
 * a b c [i i i] d e f
 *
 * vowel count = 3
 *
 * Maximum = 3
 *
 * Important Formula:
 *
 * Character entering the window:
 * s.charAt(right)
 *
 * Character leaving the window:
 * s.charAt(right - k)
 *
 * Therefore:
 *
 * 1. Check the character at right.
 * 2. Check the character at right - k.
 * 3. Update vowelCount.
 * 4. Update maxVowels.
 * 5. Increment right.
 *
 * Key Learning:
 * - A fixed-size sliding window can be maintained without using
 *   a Queue, HashMap, or HashSet.
 * - Only the information that changes between windows needs to
 *   be maintained.
 * - Instead of counting every vowel in every substring, we remove
 *   the contribution of the outgoing character and add the
 *   contribution of the incoming character.
 * - This reduces the solution from O(n * k) to O(n).
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * Common Mistakes:
 * - Using right - k - 1 instead of right - k for the outgoing
 *   character.
 * - Incrementing right before using it to access the entering
 *   character.
 * - Forgetting to update the maximum after sliding.
 * - Recalculating the entire window instead of maintaining a
 *   running count.
 * - Forgetting that the window must always contain exactly k
 *   characters.
 *
 * Date Solved: 12-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC1456_MaximumNumberOfVowelsInASubstringOfGivenLength {

    static class Solution {
        public int maxVowels(String s, int k) {
            int right = 0 ; 
            int vowelCount = 0 ; 
            int maxVowels = 0 ; 
            int n = s.length() -1 ; 
            for(int i = 0 ; i < k ; i ++){
                char ch = s.charAt(i) ; 
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount ++ ; 
                }
                right ++ ; 
            }
            maxVowels = vowelCount ; 
            while(right <= n){
                char ch = s.charAt(right) ; 
                char left = s.charAt(right - k   ) ; 
                if(left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u'){
                    vowelCount -- ;
                }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount ++ ; 
                }
                maxVowels = Math.max(vowelCount, maxVowels) ; 
                if(right == n ){
                    break ; 
                }
                right ++ ; 
            }
            return maxVowels;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "abciiidef";
        System.out.println(solution.maxVowels(s1, 3));
        // Expected: 3

        // Test Case 2
        String s2 = "aeiou";
        System.out.println(solution.maxVowels(s2, 2));
        // Expected: 2

        // Test Case 3
        String s3 = "leetcode";
        System.out.println(solution.maxVowels(s3, 3));
        // Expected: 2

        // Test Case 4
        String s4 = "rhythms";
        System.out.println(solution.maxVowels(s4, 4));
        // Expected: 0
    }
}