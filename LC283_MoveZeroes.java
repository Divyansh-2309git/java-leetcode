/*
 * Problem: LC 283 - Move Zeroes
 *
 * Topic: Arrays
 * Pattern:Two pointers 
 * Difficulty: Easy
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 *
 * Approach:
 * Traverse the array using one pointer.
 * Maintain another pointer that marks the next position for a non-zero element.
 * Whenever a non-zero is found, swap it with the element at the write pointer.
 *
 * Key Learning:
 * Two pointers can be used to rearrange elements in-place while preserving order.
 *
 * Date Solved:30-7-26
 *
 * Confidence:⭐⭐⭐⭐⭐
 */
import java.util.Arrays;

public class LC283_MoveZeroes {

    public void moveZeroes(int[] nums) {
            int right = 0 ; 
            for (int left = 0 ; left < nums.length ; left ++){
                if(nums[left] != 0 ){
                    int temp = nums[left] ; 
                    nums[left] = nums[right] ; 
                    nums[right] = temp ; 
                    right ++ ; 
                }
            }
    }

    public static void main(String[] args) {

        LC283_MoveZeroes solution = new LC283_MoveZeroes();

        int[] nums = {0, 1, 0, 3,0, 12};

        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}