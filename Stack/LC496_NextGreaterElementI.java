/*
 * Problem: LC 496 - Next Greater Element I
 *
 * Topic: Stack
 * Pattern: Monotonic Decreasing Stack
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * Approach:
 * - Traverse nums2 from right to left.
 * - Remove elements from the stack that are smaller than or equal
 *   to the current element.
 * - The remaining top element is the next greater element.
 * - Store each result in a HashMap.
 * - Use nums1 to retrieve the required answers from the map.
 *
 * Key Learning:
 * - Monotonic Stack helps find the next greater element efficiently.
 * - Process from right to left so the stack represents useful
 *   candidates to the right.
 *
 * Date Solved: 20-08-2026
 *
 * Status: Solved With Assistance
 *
 * Confidence: ⭐⭐
 *
 * Revision: Yes
 */

import java.util.*;

public class LC496_NextGreaterElementI {

    static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            int[] ans = new int[nums1.length];

            Stack<Integer> st = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = nums2.length - 1; i >= 0; i--) {

                while (!st.isEmpty() && st.peek() <= nums2[i]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    map.put(nums2[i], -1);
                } else {
                    map.put(nums2[i], st.peek());
                }

                st.push(nums2[i]);
            }

            for (int i = 0; i < nums1.length; i++) {
                ans[i] = map.get(nums1[i]);
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1_1 = {4, 1, 2};
        int[] nums2_1 = {1, 3, 4, 2};

        System.out.println(
            Arrays.toString(
                solution.nextGreaterElement(nums1_1, nums2_1)
            )
        );
        // Expected: [-1, 3, -1]


        // Test Case 2
        int[] nums1_2 = {2, 4};
        int[] nums2_2 = {1, 2, 3, 4};

        System.out.println(
            Arrays.toString(
                solution.nextGreaterElement(nums1_2, nums2_2)
            )
        );
        // Expected: [3, -1]


        // Test Case 3
        int[] nums1_3 = {1, 3, 5, 2, 4};
        int[] nums2_3 = {6, 5, 4, 3, 2, 1, 7};

        System.out.println(
            Arrays.toString(
                solution.nextGreaterElement(nums1_3, nums2_3)
            )
        );
        // Expected: [7, 7, 7, 7, 7]
    }
}