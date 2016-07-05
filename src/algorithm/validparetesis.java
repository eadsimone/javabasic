package algorithm;

/**
 * Created by edesimone on 04/07/16.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

import java.util.*;

public class validparetesis {

    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0)
            return true;

        /*always be a par number */
        if(s.length() % 2 == 1)
            return false;

        Stack<Character> stack = new Stack<Character>();
        HashSet<Character> rightPars = new HashSet<Character>();
        rightPars.add(')');
        rightPars.add('}');
        rightPars.add(']');

        char arr[] = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            char c = arr[i];
            if(!rightPars.contains(c)){
                stack.push(c);
            }else{
                if(stack.empty())
                    return false;
                char l = stack.pop();
                if( l != getLeft(c))
                    return false;
            }
        }

        if(stack.empty())
            return true;
        else
            return false;
    }

    private char getLeft(char right){
        if(right == ')')
            return '(';
        if(right == '}')
            return '{';
        if(right == ']')
            return '[';

        return 'a';
    }

    public static void main(String[] args) {
        String parentesis = "()[]{}";

        validparetesis p = new validparetesis();
        boolean valid = p.isValid(parentesis);

    }
}


