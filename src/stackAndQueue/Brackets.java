package stackAndQueue;

import java.util.Stack;

public class Brackets {

    static  int solution(String S) {
        Stack<Character> myString = new Stack<>();
        char[] brackets = S.toCharArray();
        for( int i = 0 ; i < brackets.length; i++) {
            switch(brackets[i]) {
                case ('{') :
                    myString.push('{'); break;
                case ('[') :
                    myString.push('['); break;
                case ('(') :
                    myString.push('('); break;
                case ('}') :
                    if (!myString.isEmpty() && myString.peek().equals('{')) {
                        myString.pop();
                    } else return 0;
                    break;
                case (')') :
                    if (!myString.isEmpty() && myString.peek().equals('(')) {
                        myString.pop();
                    } else return 0;
                    break;
                case (']') :
                    if (!myString.isEmpty()&& myString.peek().equals('[')) {
                        myString.pop();
                    } else return 0;
                    break;
                default:
            }
        }
        if (myString.isEmpty()) return 1;
        else return 0;
    }


    public static void main(String[] args) {
        System.out.println(solution(")]"));
    }

}
