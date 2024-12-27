package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k = j+1;
                int d = nums.length-1;
                while(k<d){
                    long sum = (long) nums[i]+nums[j]+nums[k]+nums[d];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[d]));
                        while(j<k && nums[j]==nums[j+1]){
                            j++;
                        }
                        while(k<d && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<d && nums[d]==nums[d-1]){
                            d--;
                        }
                        k++;
                        d--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        d--;
                    }
                }
            }
        }
        return result;
    }
}
