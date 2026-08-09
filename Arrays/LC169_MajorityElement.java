/*
 * Problem: LC 169 - Majority Element
 *
 * Topic: Arrays
 * Pattern: Boyer-Moore Voting Algorithm
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Maintain a candidate element and a count.
 * - If count becomes 0, set candidate to current element.
 * - Increment count if current element matches candidate, else decrement.
 *
 * Key Learning:
 * - Boyer-Moore Voting Algorithm allows finding majority element (> n/2) in O(n) time and O(1) space.
 *
 * Date Solved: 01-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

public class LC169_MajorityElement {

    static class Solution {
        public int majorityElement(int[] nums) {
            int count = 1 ; 
            int curr = nums[0]; 
            for(int i = 1 ; i < nums.length ; i ++){
                if(nums[i] == curr ){
                    count ++ ; 
                }else{
                    count -- ; 
                    if(count == 0){
                        curr = nums[i] ; 
                        count = 1 ; 
                    }
                }
            }
            return curr ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1)); // 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2)); // 2

    }
}