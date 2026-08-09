/*
 * Problem: LC 217 - Contains Duplicate
 *
 * Topic: Hashing
 * Pattern: HashSet Duplicate Detection
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Iterate through array and insert into HashSet.
 * - Return true if element is already in set.
 *
 * Key Learning:
 * - HashSet provides O(1) average lookup for duplicate detection.
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.*;

public class LC217_ContainsDuplicate{

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>() ; 
            for(int num : nums){
                if(set.contains(num)){
                    return true ; 
                }
                set.add(num) ; 
            }
            return false ; 
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 1};

        System.out.println(solution.containsDuplicate(nums));
    }
}