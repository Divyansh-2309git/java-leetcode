import java.util.*;

public class LC16_3SumClosest {

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums) ; 
            int closestSum = Integer.MAX_VALUE ; 
            int val = 0 ; 
            for(int i = 0 ; i < nums.length ; i ++){
                int left = i + 1 ;  
                int right = nums.length - 1 ; 
                
                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right] ; 
                    if(Math.abs(target - sum) < closestSum){
                        val = sum ;  
                        closestSum = Math.abs(target - sum );  
                    }
                    if(sum == target ){
                        return sum ; 
                    }
                    if(sum > target){
                        right -- ; 
                    }else{
                        left ++ ; 
                    }

                }
            }
            return val ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {-1, 2, 1, -4};

        System.out.println(
            solution.threeSumClosest(nums1, 1)
        );
        // Expected: 2


        // Test Case 2
        int[] nums2 = {0, 0, 0};

        System.out.println(
            solution.threeSumClosest(nums2, 1)
        );
        // Expected: 0
    }
}