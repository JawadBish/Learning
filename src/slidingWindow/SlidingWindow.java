package slidingWindow;

import java.util.HashMap;
import java.util.List;

public class SlidingWindow {

    public static Integer maxSubArrayOfK(int[] array, int k) {
        /*
            return MAX subarray of 3
            example  : array = {1,7,4,3,1,2,1,5,1}   K = 4
                {1,7,4,3}
                   {7,4,3,1}
                     {4.3.1.2}
                            int i = 0   i < length - k
                            int j = i   j <  i + k    windows+= A[j]
                     keep tracking each subarray and compare with MAX.
         */
    Integer maxSubArray = 0;

        for( int i = 0 ; i <= array.length - k ; i ++) {
            Integer windowSum = 0;
            for ( int j = i ; j < i + k ; j++) {
               windowSum+= array[j];
            }
            maxSubArray = Math.max(windowSum, maxSubArray);
        }
    return maxSubArray;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,-1,-2,7,3,-1,2};
        System.out.println(maxSubArrayOfK(arr,4));
    }

}
