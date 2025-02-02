package String;

public class LargestOdd {
    public static void main(String[] args) {
        String num = "13";
       for(int i=num.length()-1;i>=0;i--){
         if((num.charAt(i)-'0')%2!=0){
             System.out.println(num.substring(0,i+1));
             break;
         }
       }
        System.out.println("");
    }
}
/*
BRUTE FORCE
 String max ="";
      for(int i=0;i<num.length();i++){
        for(int j=i;j<num.length();j++){
            String el = num.substring(i,j+1);
            if((el.charAt(el.length()-1)-'0')%2!=0){
                if(max.isEmpty() || el.length()>max.length() || (el.length()==max.length() && el.compareTo(max)>0)){
                    max = el;
                }
            }
        }
        }
        return max;
    }
 */
