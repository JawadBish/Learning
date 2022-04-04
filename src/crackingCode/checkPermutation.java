package crackingCode;

public class checkPermutation {

    public static boolean isPermutationOfOther(String str, String other) {
        /*
        str 1 ->"ab"  : permuatation : "ab" and "ba"
                "abc" : "abc","acb","bca","bac","cab","cba"
        str 2 -> "cab"

        approach 1 :
        -   find all mutations of str1 and put in hashmap -> for(swap(i,i+1))
        -   compare with str2 -> find in str2
                                            -> if found : return true;
                                                else : continue
            for(int i -> n) (i,i=1)
            swap(str, i, j) {
              O(1) :
              char temp = charAt(i);
              charAt(i) = charAt(j);
              charAt(j) = temp
            }
             (a,b)
             (a,c)
             (b,c)



         */
        return true;
    }

    public static void main(String[] args) {
        String str = "abcd";
        String other = "abcde";
        System.out.println(isPermutationOfOther(str,other));
    }

}
