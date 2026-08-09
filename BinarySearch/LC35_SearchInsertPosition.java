/*
 * Problem: LC 35 - Search Insert Position
 *
 * Topic: Binary Search
 * Pattern: Binary Search Boundary Property
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Standard binary search with low and high pointers.
 * - If target is found, return index.
 * - Otherwise, return low pointer position which represents insertion index.
 *
 * Key Learning:
 * - When target is not found in binary search, the low pointer lands on the exact insertion index.
 *
 * Date Solved: 01-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: Yes
 */

public class LC35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0 ; 
        int right = nums.length - 1  ; 
        while(left <= right){
            int mid = left + (right - left ) / 2 ; 
            if(nums[mid] == target){
                return mid ; 
            }else if(nums[mid] < target){
                left = mid + 1 ; 
            }else{
                right = mid - 1 ; 
            }
        }
        return left ;
    }

    public static void main(String[] args) {

        LC35_SearchInsertPosition solution = new LC35_SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};

        System.out.println(solution.searchInsert(nums, 5)); // 2
        System.out.println(solution.searchInsert(nums, 2)); // 1
        System.out.println(solution.searchInsert(nums, 7)); // 4
        System.out.println(solution.searchInsert(nums, 6)); // 3
        System.out.println(solution.searchInsert(nums, 0)); // 0
    }
}