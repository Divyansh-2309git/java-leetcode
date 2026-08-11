import java.util.*;

public class LC34_FindFirstAndLastPositionOfElementInSortedArray {

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0 ; 
            int right = nums.length - 1 ; 
            int[] ans = new int[]{-1, -1} ; 
            while(left <= right){
                int mid = left + (right - left) / 2 ; 
                
                if(nums[mid] == target){
                    ans[0] = mid ; 
                    right = mid - 1 ; 
                }
                else if(nums[mid] > target){
                    right = mid - 1 ; 
                }else{
                    left = mid + 1 ; 
                }
            }
            left = 0 ; 
            right = nums.length - 1 ; 
            while(left <= right){
                int mid = left + (right - left) / 2 ; 
                
                if(nums[mid] == target){
                    ans[1] = mid ; 
                    left = mid + 1 ; 
                }
                else if(nums[mid] > target){
                    right = mid - 1 ; 
                }else{
                    left = mid + 1 ; 
                }
            }
            
            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {5, 7, 7, 8, 8 , 8 , 8 , 8 , 8, 8 , 8 , 8 , 8 , 8, 10};
        System.out.println(
                Arrays.toString(solution.searchRange(nums1, 8))
        );
        // Expected: [3, 4]

        // Test Case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        System.out.println(
                Arrays.toString(solution.searchRange(nums2, 6))
        );
        // Expected: [-1, -1]

        // Test Case 3
        int[] nums3 = {1};
        System.out.println(
                Arrays.toString(solution.searchRange(nums3, 1))
        );
        // Expected: [0, 0]

        // Test Case 4
        int[] nums4 = {2, 2, 2, 2, 2};
        System.out.println(
                Arrays.toString(solution.searchRange(nums4, 2))
        );
        // Expected: [0, 4]
    }
}