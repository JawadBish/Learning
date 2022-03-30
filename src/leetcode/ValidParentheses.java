package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if ( s == "") return true;
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{' : bracket.push(c); break;
                case '(' : bracket.push(c); break;
                case '[' : bracket.push(c); break;
                case ')' : if (bracket.empty() || bracket.peek() != '(') return false; else bracket.pop(); break;
                case '}' : if (bracket.empty() || bracket.peek() != '{') return false; else bracket.pop(); break;
                case ']' : if (bracket.empty() || bracket.peek() != '[') return false; else bracket.pop(); break;
                default: ;
            }
        }
                return bracket.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

}
