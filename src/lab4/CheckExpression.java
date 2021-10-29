package lab4;

import java.util.*;

public class CheckExpression {
    static String BalancedBrackets(String expr) {
        {
            if (expr.isEmpty())
                return "Balanced";

            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < expr.length(); i++)
            {
                char current = expr.charAt(i);
                if (current == '{' || current == '(' || current == '[')
                {
                    stack.push(current);
                }
                if (current == '}' || current == ')' || current == ']')
                {
                    if (stack.isEmpty())
                        return "Not Balanced";
                    char last = stack.peek();
                    if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                        stack.pop();
                    else
                        return "Not Balanced";
                }
            }
            return stack.isEmpty()?"Balanced":"Not Balanced";
        }
    }
}

