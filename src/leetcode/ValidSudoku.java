package leetcode;

import java.util.HashSet;

public class ValidSudoku {
        public static final int GRID_SIZE = 9;
    static boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        // check each column
        for (int i = 0; i < 9; i++) {
            boolean[] m = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (m[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    m[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        //check each row
        for (int j = 0; j < 9; j++) {
            boolean[] m = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (m[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    m[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        //check each 3*3 matrix
        for (int block = 0; block < 9; block++) {
            boolean[] m = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (m[(int) (board[i][j] - '1')]) {
                            return false;
                        }
                        m[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }

        return true;
    }





        //        HashSet<String> matrix = new HashSet<>();
//        for(int i = 0 ; i < board.length ; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                char current = board[i][j];
//                if (current != '.') {
//                    if (!matrix.add("row: " + current + "at" + i) ||
//                            !matrix.add("column: " + current + "at" + j) ||
//                            !matrix.add("grid: " + current + "at" + i / 3 + "-" + j / 3)) {
//                        return false;
//                    }
//                }
//            }
//        }
//    return true;
//    }



        /*
         * its 9*9 Sudoku
         * Each row must contain the digits 1-9 without repetition.
         * Each column must contain the digits 1-9 without repetition.
         * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
         */
        /*
        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules
         */



    public static void main(String[] args) {

        char[][] board = {
                  {'5', '3', '3', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }
}
