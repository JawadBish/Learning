package crackingCode;

import java.util.Arrays;

public class Triangle {

    /*
    A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].

     */
    static  int solution(int[] A) {
        if (A.length < 3 ) return 0;
        Arrays.sort(A);
        for(int i=2; i < A.length ; i++) {
            if((long)A[i-1] + A[i-2] > A[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] jawad = new int[] {1,2,3};
        System.out.println(solution(jawad));
    }
}
