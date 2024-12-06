// Valid Parentheses
// Problem statement
// You're given a string 'S' consisting of "{", "}", "(", ")", "[" and "]" .



// Return true if the given string 'S' is balanced, else return false.



// For example:
// 'S' = "{}()".

// There is always an opening brace before a closing brace i.e. '{' before '}', '(' before ').
// So the 'S' is Balanced.
import java.util.Stack;
public class day_16 {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if(c=='('|| c=='{'|| c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty() || 
                (c==')'&& stack.peek()!='(')||
                (c=='}'&& stack.peek()!='{')||
                (c==']'&& stack.peek()!= '[')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}