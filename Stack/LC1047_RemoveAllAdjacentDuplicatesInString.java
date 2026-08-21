/*
 * Problem: LC 1047 - Remove All Adjacent Duplicates In String
 *
 * Topic: Stack
 * Pattern: Stack / Adjacent Pair Removal
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Traverse the string character by character.
 * - If the stack is empty, push the character.
 * - If the current character matches the stack top, pop it.
 * - Otherwise, push the current character.
 * - Build the final string from the remaining stack.
 *
 * Key Learning:
 * - The stack's top represents the previous remaining character.
 * - When two adjacent characters become equal, they can be
 *   removed immediately.
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */
import java.util.*;

public class LC1047_RemoveAllAdjacentDuplicatesInString {

    static class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>() ; 
            StringBuilder ans = new StringBuilder() ; 
            for(int i = 0 ; i < s.length() ; i ++){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i)) ; 
                }else{
                    if(stack.peek() == s.charAt(i)){
                        stack.pop(); 
                    }else{
                        stack.push(s.charAt(i)) ; 
                    }
                }
            }
            while(!stack.isEmpty()){
                ans.append(stack.pop()) ; 
            }
           
            
            return ans.reverse().toString() ; 


        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "abbaca";

        System.out.println(
            solution.removeDuplicates(s1)
        );
        // Expected: "ca"


        // Test Case 2
        String s2 = "azxxzy";

        System.out.println(
            solution.removeDuplicates(s2)
        );
        // Expected: "ay"


        // Test Case 3
        String s3 = "aabbcc";

        System.out.println(
            solution.removeDuplicates(s3)
        );
        // Expected: ""
    }
}