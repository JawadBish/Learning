package crackingCode;

public class RotationArray {

    public static int[] cyclicRotation(int [] A , int K) {


        for (int i=0 ; i <K ; i++) {
            if(A.length == 0 || A.length == K) {
                return A;
            }
            int lastValue = A[A.length-1];
            for(int j = A.length-2 ; j>=0; j--) {
                A[j+1] = A[j];
            }
            A[0] = lastValue;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
       int[] result = cyclicRotation(A,K);
        for (int i = 0 ; i < result.length; i ++) {
            System.out.print(result[i] +",");
        }
    }

}
