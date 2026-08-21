import java.util.*;

public class LC986_IntervalListIntersections {

    static class Solution {
        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            int i = 0 ; 
            int j = 0 ; 
            
            ArrayList<int[]> result = new ArrayList<>(); 
            while(i < firstList.length && j < secondList.length){
                int start = Math.max(firstList[i][0] , secondList[j][0]) ; 
                int end = Math.min(firstList[i][1] , secondList[j][1] ) ; 

                if(start <= end){
                    result.add(new int[] {start , end}) ; 
                }

                if(firstList[i][1] < secondList[j][1]){
                    i ++ ; 
                }else{
                    j++ ; 
                }

            }
            return result.toArray(new int[result.size()][]) ; 
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        int[][] firstList1 = {
            {0, 2},
            {5, 10},
            {13, 23},
            {24, 25}
        };

        int[][] secondList1 = {
            {1, 5},
            {8, 12},
            {15, 24},
            {25, 26}
        };

        System.out.println(
            Arrays.deepToString(
                solution.intervalIntersection(firstList1, secondList1)
            )
        );
        // Expected:
        // [[1,2], [5,5], [8,10], [15,23], [24,24], [25,25]]


        // Test Case 2
        int[][] firstList2 = {
            {1, 3},
            {5, 9}
        };

        int[][] secondList2 = {};

        System.out.println(
            Arrays.deepToString(
                solution.intervalIntersection(firstList2, secondList2)
            )
        );
        // Expected: []
    }
}