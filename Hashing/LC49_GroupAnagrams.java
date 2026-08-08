/*
 * Problem: LC 49 - Group Anagrams
 *
 * Topic: Array, String, Hashing
 * Pattern: Hash Map
 * Difficulty: Medium
 *
 * Time Complexity: O(n × k log k)
 * Space Complexity: O(n × k)
 *
 * Approach:
 * - Create a HashMap where:
 *      Key   -> Sorted version of a string.
 *      Value -> List of all strings having the same sorted form.
 * - Traverse every string in the input array.
 * - Convert the string into a character array and sort it.
 * - Use the sorted string as the key.
 * - If the key doesn't exist, create a new list.
 * - Add the original string to the corresponding list.
 * - Return all the grouped lists from the HashMap.
 *
 * Key Learning:
 * - Different strings can map to the same key.
 * - A HashMap can store collections (List) as values.
 * - putIfAbsent() simplifies conditional insertion.
 * - map.values() provides all grouped anagrams directly.
 *
 * Date Solved: 06-08-2026
 *
 * Confidence: ⭐⭐⭐⭐☆
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