package BinarySearch;

public class KthMissing {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int ans = find(nums,5);
        System.out.println(ans);
    }
    static int find(int[] nums,int k){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = nums[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high+k+1;
    }
}
