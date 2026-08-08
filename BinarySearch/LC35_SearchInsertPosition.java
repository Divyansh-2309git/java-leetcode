

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