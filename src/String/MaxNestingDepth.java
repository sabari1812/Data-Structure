package String;

import java.util.Stack;

public class MaxNestingDepth {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        Stack<Character> st = new Stack<>();
        int max = 0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            max = Math.max(max,st.size());
            if(s.charAt(i)==')'){
               st.pop();
            }
        }
        System.out.println(max);
    }
}
