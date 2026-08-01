/*
 * Problem: LC 344 - Reverse String
 *
 * Topic: Strings
 * Pattern: Two Pointer
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Initialize two pointers, one at the beginning and one at the end of the character array.
 * Swap the characters at both pointers and move them toward each other until they meet.
 *
 * Key Learning:
 * When two elements need to exchange positions symmetrically, traversing from both ends
 * and swapping in-place is an efficient solution that requires no extra space.
 *
 * Date Solved:31-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
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