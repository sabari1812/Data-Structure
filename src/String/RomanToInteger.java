package String;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);
        int i=0;
        int count = 0;
        while(i<s.length()-1){
            if(mpp.get(s.charAt(i))<mpp.get(s.charAt(i+1))){
                count+=mpp.get(s.charAt(i+1))-mpp.get(s.charAt(i));
                i+=2;
            }
            else{
                count+=mpp.get(s.charAt(i));
                i++;
            }
        }
        if(i<s.length()){
            count+=mpp.get(s.charAt(i));
        }
        return count;
    }
}
