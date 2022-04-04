package crackingCode;

import java.util.HashSet;

public class PremCheck {

    public static int solution(int[] A) {
/*
    N integers [1....]
    permutation = contain each element from 1 to N once and only once.
    //TODO - add permuatation Hashset O(1)
      TODO - loop over int[] and remove values from HashSet (check that removed, and not duplicated)
      TODO - if HashSet isEmpty ? done all good, else not permuataion.
 */
        HashSet<Integer> permuataionList = new HashSet<>();
        for(int i=1 ; i < A.length +1 ; i++) {
            permuataionList.add(i); ///{1,2,......A.lenght}
        }

        for(int i=0; i < A.length; i++) {
            if(!permuataionList.remove((Integer)A[i])) {
                return 0;
            }
        }
        return (permuataionList.isEmpty()) ? 1 : 0;

    }

    public static void main(String[] args) {
        int[] A = {4,1,3,2};
        System.out.println(solution(A));
    }
}
