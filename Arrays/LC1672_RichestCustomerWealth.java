/*
 * Problem: LC 1672 - Richest Customer Wealth
 *
 * Topic: Arrays
 * Pattern:Matrix Traversal
 * Difficulty: Easy
 *
 * Time Complexity:O(m * n )
 * Space Complexity:O(1) 
 *
 * Approach:
 * Traverse each customer's accounts using nested loops.
 * Calculate the total wealth for each customer and update the maximum wealth found.
 *
 * Key Learning:Nested loops are used to traverse matrices row by row.
 *
 * Date Solved:30-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
  *
 * Revision: No
 */

public class LC1672_RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0 ; 
        for (int i = 0 ; i < accounts.length ; i ++){
            int currWealth = 0 ; 
            for (int j = 0 ; j < accounts[i].length ; j ++ ){
                currWealth += accounts[i][j]; 
            }
            maxWealth = Math.max(currWealth , maxWealth) ; 
        }
        return maxWealth ; 
    }

    public static void main(String[] args) {

        LC1672_RichestCustomerWealth solution =
                new LC1672_RichestCustomerWealth();

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 1, 2}
        };

        int ans = solution.maximumWealth(accounts);

        System.out.println(ans);
    }
}