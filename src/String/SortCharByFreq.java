package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFreq {
    public String frequencySort(String s) {
    HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
        if(mpp.containsKey(s.charAt(i))){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }else{
            mpp.put(s.charAt(i),1);
        }
    }
    String result ="";
    List<Map.Entry<Character,Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
        for(Map.Entry<Character,Integer> entry:list){
        int count = entry.getValue();
        while(count>0){
            result+=entry.getKey();
            count--;
        }
    }
        return result;
}
}
