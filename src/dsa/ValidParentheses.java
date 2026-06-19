package dsa;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "(})[]{{}";
        boolean result = isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            if((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[')) {
                stack.push(s.charAt(i));
            }
            else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                char current = s.charAt(i);

                if(((current == ')') && (top == '(')) ||
                        ((current == '}') && (top == '{')) ||
                        ((current == ']') && (top == '['))
                ) {
                    stack.pop();
                }

                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
