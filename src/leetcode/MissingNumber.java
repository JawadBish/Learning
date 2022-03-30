package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int sumOfNumbers = ((nums.length ) * (nums.length + 1)) / 2;
        int sumofArray = 0;
        for (int i : nums) {
            sumofArray += i;
        }
        return sumOfNumbers - sumofArray;
    }


    public static void main(String[] args) {

        int[] numbs = {1,0,2};
        System.out.println(missingNumber(numbs));

    }

}
