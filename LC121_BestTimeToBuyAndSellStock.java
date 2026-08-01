/*
 * Problem: LC 121 - Best Time to Buy and Sell Stock
 *
 * Topic:Arrays
 * Pattern:Running Minimum
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Keep track of the minimum stock price seen so far.
 * At every day, calculate the profit if sold today.
 * Update the maximum profit and minimum price.
 *
 *
 * Key Learning:
 * Maintain a running minimum while traversing the array.
 *
 * Date Solved: 1-8-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 * 
 * Revesion needed : Yes
 */
public class LC121_BestTimeToBuyAndSellStock {

    static class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = prices[0] ; 
            int maxProfit = 0 ; 
            for(int i = 0 ; i < prices.length ; i ++){
                int currProfit = prices[i] - minPrice ; 
                maxProfit = Math.max(currProfit , maxProfit); 
                minPrice = Math.min(prices[i] , minPrice) ; 
            }
            return maxProfit ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices1)); // 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices2)); // 0

    }
}