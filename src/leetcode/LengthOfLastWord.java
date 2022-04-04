package leetcode;

public class LengthOfLastWord {


    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result = 0;
            } else {
                result++;
            }
        }
        return result;
    }


    public static int lengthOfLastWordDeveloped(String s) {
        String str = s.trim();
        String [] arr=str.split("\\s+");
        return arr[arr.length-1].length();
    }


    public static void main(String[] args) {
            String test = "Hello World       ";
            System.out.println(lengthOfLastWordDeveloped(test));
    }
}

