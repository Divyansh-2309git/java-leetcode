/*
 * Problem: LC 881 - Boats to Save People
 *
 * Topic: Arrays
 * Pattern: Two Pointers + Sorting
 * Difficulty: Medium
 *
 * Approach:
 * - Sort the people array.
 * - Use two pointers: left at the lightest person and right at the heaviest.
 * - If both can fit within the limit, put them in the same boat.
 * - Otherwise, the heaviest person must go alone.
 * - Count each boat until all people are handled.
 *
 * Key Learning:
 * - After sorting, if the lightest + heaviest exceed the limit,
 *   the heaviest cannot pair with anyone.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) extra
 *
 * Date Solved: 15-08-2026
 *
 * Status: Solved Independently
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.Arrays ; 
public class LC881_BoatsToSavePeople {

    static class Solution {
        public int numRescueBoats(int[] people, int limit) {
            int left = 0 ; 
            int right = people.length -1 ; 
            int count = 0 ; 
            Arrays.sort(people) ;  
            while(left <= right){
                if(people[left] + people[right] <=  limit){
                    count ++ ; 
                    left ++ ; 
                    right -- ; 
                }else{
                    count ++ ; 
                    right -- ; 
                }
            }
            return count ;

        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] people1 = {1, 2};
        System.out.println(solution.numRescueBoats(people1, 3));
        // Expected: 1

        // Test Case 2
        int[] people2 = {3, 2, 2, 1};
        System.out.println(solution.numRescueBoats(people2, 3));
        // Expected: 3

        // Test Case 3
        int[] people3 = {3, 5, 3, 4};
        System.out.println(solution.numRescueBoats(people3, 5));
        // Expected: 4
    }
}