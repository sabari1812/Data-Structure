package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountSmaller {
    static HashMap<Integer,Integer> mpp = new HashMap<>();
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],0);
        }
        mergesort(nums,0, nums.length-1);
        System.out.println(mpp);
    }
    static void mergesort(int[] nums,int low,int high){

        if(low>=high) return;
            int mid = (low+high)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,mid,high);


    }
    static void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        int rightCount = 0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                mpp.put(nums[left], mpp.get(nums[left]) + rightCount);
                temp.add(nums[left]);
                left++;
            }
            else{
                rightCount++;
                temp.add(nums[right]);
                right++;

            }
        }
        while(left<=mid){
            mpp.put(nums[left], mpp.get(nums[left]) + rightCount);
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i] = temp.get(i-low);
        }

    }
}
