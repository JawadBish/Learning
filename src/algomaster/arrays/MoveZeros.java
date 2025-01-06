package algomaster.arrays;

//https://leetcode.com/problems/move-zeroes/description/

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

*/

/* my suggestion : I want to have two pointers - one to check the zero and another one AHEAD to point at current place to switch with zero.

0,1,0,3,12 ->


*/


public class MoveZeros {

    public static  void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }

            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }

        for (int w = 0; w < nums.length; w++) {
            System.out.println(nums[w] + ",");
        }
    }



    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }


}

