/*
 * Problem: LC 217 - Contains Duplicate 
 *
 * Topic:Array , Hashing
 * Pattern:Hash Set
 * Difficulty:Easy 
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * - Create a HashSet to keep track of visited elements.
 * - Traverse the array one element at a time.
 * - Try to add each element to the HashSet.
 * - If adding an element returns false, it already exists in the HashSet,
 *   meaning a duplicate has been found.
 * - Return true immediately when a duplicate is encountered.
 * - If the traversal completes without finding any duplicates, return false.
 *
 * Key Learning:
 * Return after finding the value for more optimised code 
 * 
 * Date Solved: 6-08-2026
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