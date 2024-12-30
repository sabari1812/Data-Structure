package Array;

import java.util.ArrayList;
import java.util.List;

public class Majority2 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
       List<Integer> ans  = find(nums);
        System.out.println(ans);
    }
    static List<Integer> find(int[] nums){
        int el1 = 0;
        int el2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                el1 = nums[i];
                cnt1++;
            }
            else if(cnt2==0){
                el2 = nums[i];
                cnt2++;
            }
            else if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int c1 = 0;
        int c2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                c1++;
            }
            if(el2==nums[i]){
                c2++;
            }
        }
        if(c1>nums.length/3){
            ans.add(el1);
        }
        if(c2>nums.length/3){
            ans.add(el2);
        }
       return ans;
    }
}
