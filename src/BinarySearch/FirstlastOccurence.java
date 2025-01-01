package BinarySearch;

public class FirstlastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int first = occurance(nums,target,true);
        int second = occurance(nums,target,false);
        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = second;
        return ans;
    }
    public int occurance(int[] nums,int target,boolean fOrs){
        int low =0;
        int ans = -1;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                if(fOrs){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    ans = mid;
                    low = mid+1;
                }
            }

        }
        return ans;
    }
}
