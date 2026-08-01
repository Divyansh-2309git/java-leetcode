/*
 * Problem: LC 27 - Remove Element
 *
 * Topic: Arrays
 * Pattern: Two Pointer(Read and Write)
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity:O(n)
 *
 * Approach:
 * Traverse the array once using a read pointer.
 * Whenever an element is not equal to the target value,
 * write it at the current write pointer and advance the write pointer.
 * Return the number of valid elements.
 *
 * Key Learning: A write pointer can compact valid elements in-place without using swaps.
 *
 * Date Solved: 31-7-2026
 *
 * Confidence:⭐⭐⭐⭐⭐
 */
import java.util.Arrays;

public class LC27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int left = 0 ; 
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] != val){
                nums[left] = nums[i] ;
                left ++ ; 
            }
        }
        return left ; 
        
    }

    public static void main(String[] args) {

        LC27_RemoveElement solution = new LC27_RemoveElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }
}