package crackingCode;

import java.util.Arrays;

public class MaxProductOfThree {

    int[] largest =  new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    int[] smallest = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};

    public int solution (int[] A ) {
        for (int num : A) {
            considerSmallest(num);
            considerLargest(num);
        }
        int prod1 = smallest[0] * smallest[1] * largest[0];
        int prod2 = largest[0] * largest[1] * largest[2];
        return Math.max(prod1, prod2);
    }


    private void considerSmallest(int num) {
        if( num < smallest[0] ) {
            smallest[1] = smallest[0];
            smallest[0] = num;
        } else if( num < smallest[1]) {
            smallest[1] = num;
        }
    }

    private void considerLargest(int num) {
        if( num > largest[0] ) {
            largest[2] = largest[1];
            largest[1] = largest[0];
            largest[0] = num;
        } else if( num > largest[1]) {
            largest[2] = largest[1];
            largest[1] = num;
        } else if( num > largest[2]) {
            largest[2] = num;
        }
    }



    public static void main(String[] args) {
        MaxProductOfThree mp = new MaxProductOfThree();
        System.out.println(mp.solution(new int[] {-2, -5, -6}));
    }
}


/*
MY SOLUTION : 88

// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
      int maxOfAll = Integer.MIN_VALUE;
        int otherValues = Integer.MIN_VALUE;
        Arrays.sort(A);
       for( int i = 0 ; i < A.length ; i++) {
            maxOfAll = Math.max( maxOfAll , A[i]); // 5
            int max2Positive = Math.abs(A[A.length-2] * A[A.length-3]);
            int max2Negative = Math.abs(A[0] * A[1]);
            otherValues = Math.max(max2Negative, max2Positive);
       }
       return otherValues*maxOfAll;
    }
}


 */