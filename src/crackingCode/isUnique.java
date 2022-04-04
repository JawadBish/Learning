package crackingCode;

import java.util.HashSet;
import java.util.Set;

public class isUnique {
    /*
        String str = "abcdefw"  SET HASHSET -> no duplicate - unique

        first one always unique -> I'll have 2 pointers :
        1-> start from index 0  (i)
        2-> start from index 1  (i+1)
        compare if there is match -> if equals return not unique (false)
                                     if !equals continue with the loop
        return true (unique)

        time complexity : O(n2)
        space complextiry : O(1)


     */
    public static boolean isUnique(String str) {
        int strLength = str.length();
        for (int i = 0; i < strLength - 1; i++) {
            for (int j = i + 1; j < strLength; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isUniqueSecondApproach(String str) {
        Set<Character> setOfChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!setOfChars.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "ab";
        System.out.println(isUniqueSecondApproach(str));
    }
}
