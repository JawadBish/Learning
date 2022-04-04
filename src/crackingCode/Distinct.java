package crackingCode;

import java.util.HashSet;

public class Distinct {

    public static int solution( int[] A) {
        HashSet<Integer> myHash = new HashSet<>();
        for (int i : A) {
            myHash.add(i);
        }
        return myHash.size();
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,2,3,2,1,2,1};
        System.out.println(solution(myArr));
    }
}
