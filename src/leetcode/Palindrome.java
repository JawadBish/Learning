package leetcode;

public class Palindrome {
    /* if number is 0 -> palindrome
     * if number is 10 -> not palindrome
     * number is negative -> not palindrome
     */

     boolean isPalindrome(int number) {
        if (number == 0) return true;
        if (number % 10 == 0 || number < 0) return false;
        int reversedNumber = 0;
        while ( number > reversedNumber ) {
            int rdigit = number % 10;
            reversedNumber = reversedNumber * 10 + rdigit;
            number /= 10;
        }
        if (number == reversedNumber || number == reversedNumber / 10 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(919));
    }

}
