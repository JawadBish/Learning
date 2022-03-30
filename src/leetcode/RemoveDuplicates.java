package leetcode;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        /*
         *   0 1 2 3 4 5   length = 6
         *  [1,1,2,3]
         *
         */
        int index = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        for(int i=0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }

        return index+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("index : " + removeDuplicates(arr));
    }


}
