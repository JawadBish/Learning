package easy;

import java.util.HashSet;
import java.util.Set;


public class leetcodeEasy {

    public static int solutionOfMissingInteger1(int[] A) {
         HashSet<Integer> nums = new HashSet<Integer>();
         for (int i = 1; i < A.length+1 ; i++) {
             System.out.println("nums add all  " + nums);
             nums.add(i);
         }
         for (int a : A ) {
             nums.remove( new Integer(a));
         }
        System.out.println("nums after remove  " + nums);
         return nums.iterator().next();
    }

    public static int solutionOfMissingInteger2(int[] A){
        Set<Integer> nums = new HashSet<Integer>();
        //Add All numbers to SET (unique - no duplicates)
        // SET (a -> A.length)
        // loop over A -> if not contains (a) .. return it. else return first.
        for ( int a : A) {
            nums.add(a);
        }
        for (int i=1; i < A.length + 1 ; i++) {
            if (!nums.contains(i)) return i;
        }
        return A.length + 1;

    }

    public static int binaryGap(int number) {
        String binString = Integer.toBinaryString(number);
        System.out.println("Binary : " + binString);
        return 1;
    }

    public static void main(String[] args) {

        //System.out.println("Welcome to Learning : " + solutionOfMissingInteger1(new int[] {-1}));
        System.out.println("Welcome to Learning : " + solutionOfMissingInteger2(new int[] {1,2,3}));
        //binaryGap(4);
        //int num = 11;
        //System.out.println(num % 10);

    }

}
