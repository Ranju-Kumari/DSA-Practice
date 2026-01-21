package dsa_learning.stack.leetCode;

import java.util.Stack;

public class ValidParentheses_LC_20 {

    public static void main(String [] args){

        String s = "()[[]{}";
        System.out.println(isValid(s));
    }

    public static boolean  isValid(String s){
        // If the length of the string is not even then that means unbalanced parantheses
        if (s.length() % 2 != 0) {
            return false;
        }
        // Stack to store the opening brackets
        Stack<Character> stack = new Stack<>();

        // If the current character is an opening bracket, push it to the stack
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));

                // else if the current character is closing bracket and stack is not
                // empty,then check if the top of the stack is a matching
                // opening bracket. If yes, then remove the top of the stack.
            } else if (!stack.isEmpty() &&
                    (s.charAt(i) == ')' && stack.peek() == '('
                            || s.charAt(i) == '}' && stack.peek() == '{'
                            || s.charAt(i) == ']' && stack.peek() == '[')) {
                stack.pop();

            } else {
                return false; // closing bracket not matched.
            }
        }

        // If stack becomes empty, return true since all the parentheses were balanced.
        return stack.isEmpty();
    }
}
