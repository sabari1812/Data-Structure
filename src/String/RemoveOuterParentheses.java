package String;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }
    static String removeOuterParentheses(String s) {
        String result = "";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                count--;
            }
            if(count!=0){
                result+=s.charAt(i);
            }
            if(s.charAt(i)=='('){
                count++;
            }
        }
        return result;
    }
}
