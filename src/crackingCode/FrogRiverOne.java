package crackingCode;

import java.util.HashSet;

public class FrogRiverOne {

    static int solution(int X, int[] A) {
       /*
        pos:0  pos:X+1
        arr:A leaves
        A[K]: position of leave at time K (seconds)
        from 1 -> X

  A[0] = 1   in sec:0 one leaf at position 1
  A[1] = 3   sec:1 - leaf at position 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5  // 1,2,3,4 and now position 5 is available.
  A[7] = 4
        return 6 : 6 seocnds and path are available.
        //TODO 1- given X=5 that means we need 5 values :  1,2,3,4,5 (HashSet)
          TODO 2- loop over Int[]everytime element found, will go and delete it from HashSet.
          TODO 3- and check at every deletion that HashSet if empty - if yes, return int[i].
        */

        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 1; i <= X; i++) {
            list.add(i); //list of {1,2,3,4,5}
        }
        for (int i = 0; i < A.length; i++) {
            list.remove(A[i]);
            if (list.isEmpty()) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(13, new int[]{1, 3, 1, 4, 2, 3, 5, 4, 6, 7, 55, 8, 9, 10, 12, 34, 11, 14, 15, 15, 13, 1}));
    }
}
