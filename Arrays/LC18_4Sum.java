import java.util.*;

public class LC18_4Sum {

    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums) ; 
            List<List<Integer>> ans = new ArrayList<>() ; 
            for(int i = 0 ; i < nums.length - 3 ; i ++){
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for(int j = i + 1 ; j < nums.length - 2 ; j ++){
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }

                    int left = j + 1 ; 
                    int right = nums.length - 1  ; 
                    while(left < right ){
                        long sum = nums[i] + nums[left] + nums[right] + nums[j] ; 
                        if(sum == target){
                            List<Integer> list = Arrays.asList(nums[i] , nums[left] , nums[right] , nums[j]) ; 
                            ans.add(list) ; 
                            left ++ ; 
                            right -- ; 
                            while (left < right &&
                                nums[left] == nums[left - 1]) {
                                left++;
                            }
                            while (left < right &&
                                nums[right] == nums[right + 1]) {
                                right--;
                            }
                        }
                        else if(sum > target){
                            right -- ; 
                        }else{
                            left ++ ; 
                        }
                    }
                }
            }
            return ans ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};

        System.out.println(
            solution.fourSum(nums1, 0)
        );
        // Expected:
        // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


        // Test Case 2
        int[] nums2 = {2, 2, 2, 2, 2};

        System.out.println(
            solution.fourSum(nums2, 8)
        );
        // Expected:
        // [[2,2,2,2]]
    }
}