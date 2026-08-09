/*
 * Problem: LC 349 - Intersection of Two Arrays
 *
 * Topic: Hashing
 * Pattern: HashSet Intersection
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * Approach:
 * - Insert first array elements into set1.
 * - Filter elements of second array into result set if present in set1.
 *
 * Key Learning:
 * - HashSet set operations for unique intersection.
 *
 * Date Solved: 09-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC349_IntersectionOfTwoArrays {

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>() ; 
            HashSet<Integer> set2 = new HashSet<>() ; 
            HashSet<Integer> ans = new HashSet<>() ; 
            for(int val : nums1){
                set1.add(val) ; 
            }
            for(int val : nums2){
                set2.add(val) ; 
            }

            for(int num : set1){
                if(set2.contains(num)){
                    ans.add(num) ; 
                }
            }
            int[] answer = new int[ans.size()] ; 
            int i = 0 ; 
            for(int val : ans){
                answer[i] = val ; 
                i ++ ; 
            }


            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(Arrays.toString(
                solution.intersection(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2}
                )
        )); // [2]

        // Test Case 2
        System.out.println(Arrays.toString(
                solution.intersection(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4}
                )
        )); // [9, 4] or [4, 9]

        // Test Case 3
        System.out.println(Arrays.toString(
                solution.intersection(
                        new int[]{1, 2, 3},
                        new int[]{4, 5, 6}
                )
        )); // []

        // Test Case 4
        System.out.println(Arrays.toString(
                solution.intersection(
                        new int[]{1, 1, 1, 2},
                        new int[]{1, 1, 3}
                )
        )); // [1]
    }
}