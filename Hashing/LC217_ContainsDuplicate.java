/*
 * Problem: LC 35 - Search Insert Position
 *
 * Topic:Array 
 * Pattern:Two Pointer 
 * Difficulty:Easy 
 *
 * Time Complexity:O(log n )
 * Space Complexity:O(1)
 *
 * Approach:
 * Use Binary Search with two pointers (`left` and `right`).
 * - If `nums[mid] == target`, return `mid`.
 * - If `nums[mid] < target`, search the right half.
 * - Otherwise, search the left half.
 * - If the target is not found, `left` will point to the correct insertion index
 *
 * Key Learning:
 * Returning `left` after the loop ends gives the correct insertion index because
 * it points to the first position where the target can be inserted while maintaining
 * the sorted order.
 * 
 * Date Solved: 1-08-2026
 *
 * Confidence: ⭐⭐⭐⭐
 * 
 * Revision: Yes
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