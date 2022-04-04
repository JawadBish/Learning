package crackingCode;

public class SmallestNum {
    public static int smallestNumber(int num) {
        /*
        N = 123 (length =3 )  -> 100 (length = 3 )
        N = 9 -> 0
        N = 10 -> 10
        N = 99 -> 10
        N = 100 -> 100
        N = 999 -> 100
        start from right to left -> 0
        -> 0
        -> 0
        first -> 1
        What about negative numbers ?
        Positive :
        if N >= 0  :
            if ( n == 1 ) return 0 ;
            else {
        Math.pow(10,1) > 10
        Math.pow(10,2) > 100
        ....
        }
        else N < 0 :
        1 - Math.pow(10,2)



         */

        int length = String.valueOf(num).length();
        char number[] = String.valueOf(num).toCharArray();
        if (length < 2 ) return 0;
        for(int i= 1 ; i < length ; i++ ) {
            number[i] = '0';
        }
        number[0] = '1';
        String re = String.valueOf(number);
        int result = Integer.valueOf(re);
        return result;
    }

    public static int smallestNumberSecondApproach(int num) {
        int length = String.valueOf(num).length();
        if ( num >= 0 ) {
            //check if equals 1
            if (length == 1 ) {
                return 0;
            } else {
                return (int) Math.pow(10,length - 1 );
            }
        } else {
            return 1 - (int) Math.pow(10,length - 1 );
        }
    }

    public static void main(String[] args) {
        int number = -37;
//        System.out.println(smallestNumber(number));
        System.out.println(smallestNumberSecondApproach(number));
    }
}
