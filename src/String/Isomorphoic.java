package String;

import java.util.HashMap;

public class Isomorphoic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        HashMap<Character,Character> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(mpp.containsKey(s1) && mpp.get(s1)!=t1){
                System.out.println(false);
                break;
            }
            mpp.put(t1,s1);
        }
        System.out.print(true);
    }
}
