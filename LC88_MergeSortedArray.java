/*
 * Problem: LC 88 - Merge Sorted Array
 *
 * Topic: Arrays
 * Pattern:Two Pointers (Backward Trevarsal)
 * Difficulty: Easy
 *
 * Time Complexity:O(m + n )
 * Space Complexity:O(n)
 *
 * Approach:
 * Use three pointers:
 * - left = m - 1
 * - right = n - 1
 * - write = m + n - 1
 * 
 * Only copy remaining elements from nums2.
 * If nums1 has remaining elements, they are already in the correct position.
 *
 * Key Learning:
 * Merge from the back to avoid overwriting unprocessed elements.
 *
 * Date Solved:31-7-2026
 *
 * Confidence:⭐⭐⭐⭐
 * 
 * Revision : Needed    
 */
import java.util.Arrays;

public class LC88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m -1 ; 
        int right = n - 1 ; 
        int write = m + n - 1 ; 
        while(left >= 0 && right >= 0 ){
            if (nums1[left] > nums2[right]) {
                nums1[write] = nums1[left];
                left--;
            } else {
                nums1[write] = nums2[right];
                right--;
            }
            write--;
        }
        while (right >= 0) {
            nums1[write] = nums2[right];
            right--;
            write--;
        }
    } 

    public static void main(String[] args) {

        LC88_MergeSortedArray solution = new LC88_MergeSortedArray();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}