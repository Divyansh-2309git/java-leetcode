/*
 * Problem: LC 71 - Simplify Path
 *
 * Topic: Stack
 * Pattern: Stack Simulation / Directory Navigation
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Split path by '/' delimiter.
 * - Iterate through tokens: ignore empty strings and ".", pop stack on ".." if not empty, push valid directory names.
 * - Join stack elements with "/" to construct canonical path.
 *
 * Key Learning:
 * - A stack effectively models directory tree navigation where ".." pops the parent directory.
 *
 * Date Solved: TODO: USER INPUT REQUIRED
 *
 * Status: In Progress
 *
 * Confidence: TODO: USER INPUT REQUIRED
 *
 * Revision: TODO: USER INPUT REQUIRED
 */

import java.util.*;

public class LC71_SimplifyPath {

    static class Solution {
        public String simplifyPath(String path) {
            // In Progress
            return "";
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String path1 = "/home/";
        System.out.println(solution.simplifyPath(path1));
        // Expected: "/home"

        // Test Case 2
        String path2 = "/home//foo/";
        System.out.println(solution.simplifyPath(path2));
        // Expected: "/home/foo"

        // Test Case 3
        String path3 = "/home/user/Documents/../Pictures";
        System.out.println(solution.simplifyPath(path3));
        // Expected: "/home/user/Pictures"
    }
}