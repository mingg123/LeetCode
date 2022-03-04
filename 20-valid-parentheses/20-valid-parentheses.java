import java.util.*;
class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char token = s.charAt(i);
            if(token == '(' || token == '{' || token == '[') {
                st.add(token);
            } else {
                if(!st.isEmpty()) {
                    if(token == ')' && st.peek() == '(') {
                        st.pop();
                    } else if(token =='}' && st.peek() == '{') {
                        st.pop();
                    } else if(token ==']' && st.peek() == '[') {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return (st.isEmpty())? true : false;
    }
}