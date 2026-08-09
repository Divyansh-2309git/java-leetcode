/*
 * Problem: LC 36 - Valid Sudoku
 *
 * Topic: Hashing
 * Pattern: HashSet Duplicate Detection
 * Difficulty: Medium
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Approach:
 * - Traverse 9x9 grid.
 * - Track seen values in rows, columns, and 3x3 sub-boxes using encoded strings or boolean sets.
 *
 * Key Learning:
 * - Key encoding for multi-dimensional uniqueness constraint checking.
 *
 * Date Solved: 09-08-2026
 *
 * Status: TODO: USER INPUT REQUIRED (Solved - Independent vs Assisted status needed)
 *
 * Confidence: ⭐⭐⭐⭐⭐
 *
 * Revision: No
 */

import java.util.HashSet;


public class LC36_ValidSudoku {

    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashSet<Integer> row = new HashSet<>() ; 
            HashSet<Integer> col = new HashSet<>() ; 
            for(int i = 0 ; i < 9 ; i ++){
                for(int j = 0 ; j < 9 ; j++){
                    if(board[i][j] != '.'){
                        char val = board[i][j] ; 
                        int num = val - '0' ; 
                        if(row.contains(num)){
                            return false ; 
                        }
                        row.add(num) ; 
                    }
                    if(board[j][i] != '.'){
                        char value = board[j][i] ; 
                        int number = value - '0' ; 
                        if(col.contains(number)){
                            return false ; 
                        }
                        col.add(number) ; 
                    }
                    
                }
                row.clear(); 
                col.clear(); 
            }
            for (int rows = 0; rows < 9; rows += 3) {
                for (int colum = 0; colum < 9; colum += 3) {

                    HashSet<Integer> set = new HashSet<>();

                    for (int i = rows; i < rows + 3; i++) {
                        for (int j = colum; j < colum + 3; j++) {

                            if (board[i][j] != '.') {

                                char ch = board[i][j];
                                int num = ch - '0';

                                if (set.contains(num)) {
                                    return false;
                                }

                                set.add(num);
                            }
                        }
                    }
                }
            }

            

            return true;
        }
    }
    

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test Case 1
        char[][] board1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(solution.isValidSudoku(board1)); // true

        // Test Case 2
        char[][] board2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(solution.isValidSudoku(board2)); // false

        // Test Case 3
        char[][] board3 = {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}
        };

        System.out.println(solution.isValidSudoku(board3)); // true
    }
}