package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static int solution(int N) {
        //convert N from decimal to binary
        String binaryNumber = Integer.toBinaryString(N);
        System.out.println("Binary Number : " + binaryNumber);

        int longestBinaryGap = 0;
        List<Integer> onesList = new ArrayList<Integer>();

        //loop over the binary number\string (char by char - 0,1) : 0 do nothing, 1 save it to oneList (save it's index)
        //100001001
       // 0, 5, 8
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '0') continue;
            onesList.add(i);
            System.out.println(String.format("%s added to list", i));
        }
        for (int i = 0; i < onesList.size() - 1; i++) {
            int diff = onesList.get(i+1) - onesList.get(i) - 1 ;
            longestBinaryGap = Math.max(diff,longestBinaryGap);
        }
        return longestBinaryGap;
    }

    public static void main(String[] args) {
        /*
         * two approach to change from decimal to binary
         * 1- toBinaryString (Integer Function)
         * 2- Math
         * */

//        int number = 50;
//        String binaryNumber = Integer.toBinaryString(number);
//        System.out.println(String.format("Binary %s : %nBinary is %s", number, binaryNumber));
//
//        int i = 0;
//        int[] binaryDigits = new int[50];
//        while (number > 0) {
//            binaryDigits[i++] = number % 2;
//            number = number / 2;
//        }
//        System.out.print("Binary is : ");
//        for (int j = i - 1; j >= 0; j--) {
//            System.out.print(binaryDigits[j]);
//        }

        System.out.println("Solution : " + solution(2147483));
    }
}
