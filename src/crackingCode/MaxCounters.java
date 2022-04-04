package crackingCode;

import java.util.ArrayList;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        Integer maxCounterNumber = 0;
        Integer minCounterNumber = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                //Max operation
                minCounterNumber = maxCounterNumber;
            } else {
                //increment operation
                counter[A[i] - 1] = Math.max(counter[A[i] - 1] + 1 , minCounterNumber + 1);
                maxCounterNumber = Math.max(maxCounterNumber , counter[A[i] - 1]);
            }
        }

        for(int i = 0 ; i < counter.length; i++) {
            counter[i] = Math.max(counter[i], minCounterNumber);
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] payload = {3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(5, payload);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }
}
