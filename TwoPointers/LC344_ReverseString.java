/*
 * Problem: LC 344 - Reverse String
 *
 * Topic: Two Pointers
 * Pattern: Two Pointers (Opposite Ends)
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Swapping characters at left and right pointers while moving inward.
 *
 * Key Learning:
 * - Symmetrical in-place character swapping.
 *
 * Date Solved: 31-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.Arrays;

public class LC344_ReverseString {

    public void reverseString(char[] s) {
        int left = 0 ; 
        int right = s.length - 1 ; 
        while(left < right){
            char temp = s[left] ; 
            s[left] = s[right] ; 
            s[right] = temp; 
            left ++; 
            right -- ; 
        }

    }

    public static void main(String[] args) {

        LC344_ReverseString solution = new LC344_ReverseString();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        solution.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}