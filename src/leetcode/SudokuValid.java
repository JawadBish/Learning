package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SudokuValid {
   public boolean isValidSudoku(char[][] board) {
       Set<String> set = new HashSet<>();

       for(int i=0; i< board.length; i++) {
           for( int j=0 ; j < board[0].length; j++) {
               char current = board[i][j];
               if(current != '.') {
                   if (!set.add("row" + i + current)
                        || !set.add("col" + j + current)
                         || !set.add("grid" + i / 3 + "-" + j /3 )) {
                       return false;
                   }
               }
           }
       }
       return true;
   }
}
