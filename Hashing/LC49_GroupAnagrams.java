/*
 * Problem: LC 49 - Group Anagrams
 *
 * Topic: Hashing
 * Pattern: HashMap Grouping
 * Difficulty: Medium
 *
 * Time Complexity: O(n × k log k)
 * Space Complexity: O(n × k)
 *
 * Approach:
 * - For each string, sort characters to create canonical key.
 * - Store in HashMap mapping sorted key -> list of anagrams.
 *
 * Key Learning:
 * - Anagrams share identical sorted character representations as HashMap keys.
 *
 * Date Solved: 06-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐
 *
 * Revision: Yes
 */

import java.util.*;

public class LC49_GroupAnagrams {

    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String , List<String> > map = new HashMap<>() ; 
            ArrayList<List<String>> ans = new ArrayList<>() ; 
            for(String str : strs){
                char[] chars = str.toCharArray() ; 
                Arrays.sort(chars) ; 
                String sorted = new String(chars) ; 
                map.putIfAbsent(sorted, new ArrayList<>());
                map.get(sorted).add(str);
                
            }
            for(String key : map.keySet()){
                ans.add(map.get(key)) ; 
            }
            return ans ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        // Test Case 2
        System.out.println(solution.groupAnagrams(
                new String[]{""}));

        // Test Case 3
        System.out.println(solution.groupAnagrams(
                new String[]{"a"}));

    }
}