package crackingCode;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfDiscIntersaction {

    public static int solution(int[] A) {
     /*
     (0,1)
     (0,6)
     (0,4)
     (2,4)
     (0,8)
     (5,5)
TODO :
- Put them in array X
- Sort X
- Start from smaller (leftmost interval) which is (0,1) -> (5,5)
- Binary search look for it's right interval i+A[i] RANK
- Increment a counter with the rank and subtract current position (assuming one indexed) as we don't want to double count intervals and self intersections.
       */
      return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 2, 1, 4, 0}));
    }
}
