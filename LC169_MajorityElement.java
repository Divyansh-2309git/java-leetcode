/*
 * Problem: LC 169 - Majority Element
 *
 * Topic: Arrays
 * Pattern:Boyer-Moore Voting Algorithm
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Maintain a candidate and its vote count.
 * Increase the count when the same element appears.
 * Decrease it when a different element appears.
 * When the count reaches 0, choose the current element
 * as the new candidate with one vote.
 *
 * Key Learning:
 * Majority voting / candidate elimination.
 *
 * Date Solved: 1-8-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 *
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