package String;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "  the  sky is blue ";
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        StringBuilder sample = new StringBuilder();
        boolean check = false;
       int start = 0;
       int end = s.length()-1;
       while(start<=end && Character.isWhitespace(s.charAt(start))){
           start++;
       }
       while(end>=start && Character.isWhitespace(s.charAt(end))){
           end--;
       }
       for(int i=start;i<=end;i++){
           if(Character.isWhitespace(s.charAt(i))){
               if(!check){
                   check = true;
                   str.append(" ");
               }
           }else{
               check = false;
               str.append(s.charAt(i));
           }
       }
        for(int i=str.length()-1;i>=0;i--) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sample.append(str.charAt(i));
            } else {

                result.append(sample).append(" ");
                sample.setLength(0);
            }
        }
        reverse(0,sample.length()-1,sample);
        result.append(sample);
        System.out.println(result.toString());
    }
    static void reverse(int start,int end,StringBuilder str){
        while(start<end){
            char temp = str.charAt(start);
            str.setCharAt(start,str.charAt(end));
            str.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}
/*
OPTIMAL
  public String reverseWords(String s) {
    String[] arr = s.trim().split("\\s+");
    int left = 0;
    int right = arr.length-1;
    while(left<right){
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }
       return String.join(" ",arr);
    }
 */
