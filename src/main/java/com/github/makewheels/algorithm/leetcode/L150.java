package com.github.makewheels.algorithm.leetcode;

import java.util.Stack;

public class L150 {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Integer v2 = stack.pop();
                Integer v1 = stack.pop();
                int result;
                if (token.equals("+"))
                    result = v1 + v2;
                else if (token.equals("-"))
                    result = v1 - v2;
                else if (token.equals("*"))
                    result = v1 * v2;
                else
                    result = v1 / v2;
                stack.push(result);
                if (i == tokens.length - 1)
                    return stack.pop();
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return 0;
    }
}
