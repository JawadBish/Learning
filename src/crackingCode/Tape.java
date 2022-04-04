package crackingCode;

public class Tape {

    public static int solution(int[] A) {
//should return diff between | left - right|
    //O(1) HashSet of adding all 
        int numbersOfRight = 0;
        for(int i=0 ; i < A.length ; i++) {
            numbersOfRight += A[i];
        }
        int minDiff = Integer.MAX_VALUE;
        int numbersOnLeft = 0;
        for (int i=1; i < A.length -1 ; i++ ) {
            numbersOfRight -= A[i];
            numbersOnLeft += A[i];
            if (Math.abs(numbersOfRight-numbersOnLeft) < minDiff) {
                minDiff = Math.abs(numbersOfRight-numbersOnLeft);
            }
        }
        return minDiff;
    }
        


    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,1,2,4,3}));
    }
}
