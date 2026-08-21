
import java.util.*;

public class LC844_BackspaceStringCompare {

    static class Solution {
        public boolean backspaceCompare(String s, String t) {
           

        }
        return false ; 
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println(solution.backspaceCompare(s1, t1));
        // Expected: true

        // Test Case 2
        String s2 = "ab##";
        String t2 = "c#d#";
        System.out.println(solution.backspaceCompare(s2, t2));
        // Expected: true

        // Test Case 3
        String s3 = "a#c";
        String t3 = "b";
        System.out.println(solution.backspaceCompare(s3, t3));
        // Expected: false
    }
}