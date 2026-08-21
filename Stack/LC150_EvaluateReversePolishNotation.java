/*
 * Problem: LC 150 - Evaluate Reverse Polish Notation
 *
 * Topic: Stack
 * Pattern: Stack / Expression Evaluation
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Push numbers onto the stack.
 * - When an operator appears, pop the top two numbers.
 * - Apply the operator in the correct order.
 * - Push the result back onto the stack.
 * - The final stack value is the answer.
 *
 * Key Learning:
 * - For - and /, the second popped value is the left operand.
 * - Stack<Integer> avoids unnecessary String-to-int conversions.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC150_EvaluateReversePolishNotation {

    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < tokens.length; i++){

                if(tokens[i].equals("+") ||
                tokens[i].equals("-") ||
                tokens[i].equals("*") ||
                tokens[i].equals("/")){

                    int a = stack.pop();
                    int b = stack.pop();

                    int result;

                    if(tokens[i].equals("+")){
                        result = b + a;
                    }
                    else if(tokens[i].equals("-")){
                        result = b - a;
                    }
                    else if(tokens[i].equals("*")){
                        result = b * a;
                    }
                    else{
                        result = b / a;
                    }

                    stack.push(result);

                }else{
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }

            return stack.peek(); 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String[] tokens1 = {
            "2", "1", "+", "3", "*"
        };

        System.out.println(
            solution.evalRPN(tokens1)
        );
        // Expected: 9


        // Test Case 2
        String[] tokens2 = {
            "4", "13", "5", "/", "+"
        };

        System.out.println(
            solution.evalRPN(tokens2)
        );
        // Expected: 6


        // Test Case 3
        String[] tokens3 = {
            "10", "6", "9", "3", "+", "-11", "*",
            "/", "*", "17", "+", "5", "+"
        };

        System.out.println(
            solution.evalRPN(tokens3)
        );
        // Expected: 22
    }
}