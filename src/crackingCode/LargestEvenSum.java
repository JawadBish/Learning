package crackingCode;

import java.util.*;
import java.util.stream.Collectors;

public class LargestEvenSum {

    public static int[] lagestEvenSum(int[] numbers, int k) {
        /*
        {3,-2,9,-4,4} k=3
        That means, I need two largest integers and check if sum is even or odd : if odd : add largest odd
        else : add largest even.

        @Params :   -> largeEven, largeOdd. O(N) each time.
                    -> large two numbers O(N^2)
                    -> SumOfTwo = sum of largest two.
        how to check even\odd -> num % 2 == 0 : true - even , false - odd.

        Steps : - get largest two.
                - split list into two : odds, evens
                - if (sumOfTwo = even ) I pick another largest from even.
                - if ( sumOfTwo = odd) I pick another largest from odd.

        cases : K ? if(k == 0) -> return int[] || (K == 1) -> return largest even || empty int[] -> return null;

        Time Complexity: O(N * log N)
        Auxiliary Space: O(N)

         */
        int lengthOfNums = numbers.length;
        List<Integer> listOfInts = new ArrayList<Integer>();
        for ( int i = 0 ; i < lengthOfNums  ; i++) {
            listOfInts.add(numbers[i]);
        }

        List<Integer> maxNums = new ArrayList<>();
        for ( int i=0 ; i < k - 1 ; i++ ) {
            int maxNum = Collections.max(listOfInts);
            maxNums.add(maxNum);
            int indexOfMax = listOfInts.indexOf(maxNum);
            listOfInts.remove(indexOfMax);
        }
        int sumofAll = 0;
        for (Integer in : maxNums) {
            sumofAll += in;
        }

        if (sumofAll % 2 == 0) {
            List<Integer> evens = listOfInts.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
            int maxEven = Collections.max(evens);
            maxNums.add(maxEven);
        } else {
            List<Integer> odds = listOfInts.stream().filter(a -> a%2 != 0).collect(Collectors.toList());
            int maxOdd = Collections.max(odds);
            maxNums.add(maxOdd);
        }

        int[] resultArr = maxNums.stream().mapToInt(i -> i).toArray();
        maxNums.forEach(elem -> System.out.println(elem));
        return resultArr;
    }
    public static void main(String[] args) {
        int[] numbers= {2, 4, 10, 3, 5};
        int k = 3;
        lagestEvenSum(numbers,k);
    }

}
