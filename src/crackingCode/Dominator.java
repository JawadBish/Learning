package crackingCode;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

     public static int solution(int[] A) {
         /*
         dominator
          */
         Map<Integer,Integer> myMap = new HashMap<>();
         for ( int i = 0 ; i < A.length; i++) {
            if(!myMap.containsKey(A[i])) {
                myMap.put(A[i],1);
            } else {
                myMap.put(A[i], myMap.get(A[i]) + 1);
            }
            if ( myMap.get(A[i]) > A.length /2  ) return i;
          }
    return -1;
    }


    public static void main(String[] args) {

    }
}
