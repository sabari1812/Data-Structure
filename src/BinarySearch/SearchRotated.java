package BinarySearch;

public class SearchRotated {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(nums[low]<nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                   high = mid-1;
                }
                else {
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
    }
}
