/*
 * Problem: LC 844 - Backspace String Compare
 *
 * Topic: Stack
 * Pattern: Stack Simulation
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * Approach:
 * - Use a stack for each string.
 * - Push normal characters.
 * - When '#' is encountered, pop the previous character if the
 *   stack is not empty.
 * - Compare the two resulting stacks.
 *
 * Key Learning:
 * - A stack naturally models backspace behavior because the
 *   most recently added character is removed first.
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC844_BackspaceStringCompare {

    static class Solution {
        public boolean backspaceCompare(String s, String t) {
            Stack<Character> stack1 = new Stack<>() ; 
            Stack<Character> stack2 = new Stack<>() ; 
            for(int i = 0 ; i < s.length() ; i ++){
                if(s.charAt(i) == '#'){
                    if(!stack1.isEmpty()){
                        stack1.pop(); 
                    }
                }else{
                    stack1.push(s.charAt(i)) ; 
                }
            }
            for(int i = 0 ; i < t.length() ; i ++){
                if(t.charAt(i) == '#'){
                    if(!stack2.isEmpty()){
                        stack2.pop() ; 

                    }
                }else{
                    stack2.push(t.charAt(i)) ; 
                }
            }
            return stack1.equals(stack2) ; 

        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "ab#c";
        String t1 = "ad#c";

        System.out.println(
            solution.backspaceCompare(s1, t1)
        );
        // Expected: true


        // Test Case 2
        String s2 = "ab##";
        String t2 = "c#d#";

        System.out.println(
            solution.backspaceCompare(s2, t2)
        );
        // Expected: true


        // Test Case 3
        String s3 = "a#c";
        String t3 = "b";

        System.out.println(
            solution.backspaceCompare(s3, t3)
        );
        // Expected: false
    }
}