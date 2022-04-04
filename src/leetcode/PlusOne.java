package leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        /*
        approach 1 :
             int[] result = 1 + digits
              first -> make int[] -> int
              then -> add 1 -> int
              make this int back to list of int[].

        approach 2:
           first -> int[] check last index if it's 9 -> put 0 and check index-1 (loop)
           then -> return int[]
           extreme cases : -> if it's 9 : if index(0) is 9 -> add 1 in the beginning

        approach 2+ :

           from right to left -> check if digits[i] < 9 :
           {
            - add ++
            - return digits
           }
           else {
            digits[i] = 0
           }
            new int and 1 in index[0]

         */

        int len = digits.length;
        for(int i = len-1 ; i >= 0 ; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int[] result = new int[len+1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {2,9,9,9};
        int[] re = plusOne(digits);
        for (int i = 0 ; i < re.length; i++) {
            System.out.print(re[i] + ",");
        }

    }
}
