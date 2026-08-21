/*
 * Problem: LC 20 - Valid Parentheses
 *
 * Topic: Stack
 * Pattern: LIFO / Bracket Matching
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Push every opening bracket onto the stack.
 * - For a closing bracket, check the top of the stack.
 * - If it matches, pop it.
 * - If it doesn't match or the stack is empty, return false.
 * - At the end, the stack must be empty.
 *
 * Key Learning:
 * - Stack follows LIFO: Last In, First Out.
 * - The most recently opened bracket must be closed first.
 *
 * Date Solved: 19-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */
import java.util.*;

public class LC20_ValidParentheses {

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>() ; 

            for(int i = 0 ; i < s.length() ; i ++){
                char ch = s.charAt(i) ; 

                if(ch == '[' || ch =='(' || ch == '{'){
                    st.push(ch) ; 
                }else{
                    if(st.isEmpty()){
                        return false ; 
                    }
                    else if( ch == ']' && st.peek() == '['
                    || ch ==')' && st.peek() == '(' 
                    || ch == '}' && st.peek() == '{'){
                        st.pop() ; 
                    }else{
                        return false ; 
                    }

                }
            }
            return st.isEmpty() ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "()";
        System.out.println(solution.isValid(s1));
        // Expected: true

        // Test Case 2
        String s2 = "()[]{}";
        System.out.println(solution.isValid(s2));
        // Expected: true

        // Test Case 3
        String s3 = "(]";
        System.out.println(solution.isValid(s3));
        // Expected: false

        // Test Case 4
        String s4 = "([)]";
        System.out.println(solution.isValid(s4));
        // Expected: false

        // Test Case 5
        String s5 = "{[]}";
        System.out.println(solution.isValid(s5));
        // Expected: true
    }
}