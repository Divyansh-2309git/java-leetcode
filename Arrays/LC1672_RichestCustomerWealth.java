/*
 * Problem: LC 1672 - Richest Customer Wealth
 *
 * Topic: Arrays
 * Pattern: Matrix Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Iterate through each customer (row) in the 2D matrix.
 * - Compute the sum of bank accounts for each customer.
 * - Update max wealth accordingly.
 *
 * Key Learning:
 * - 2D array row-wise summation technique.
 *
 * Date Solved: 30-07-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
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