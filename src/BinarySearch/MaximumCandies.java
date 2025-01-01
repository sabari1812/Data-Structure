package BinarySearch;

public class MaximumCandies {
    public static void main(String[] args) {
        int[] nums = {5,8,6};
        int ans  = find(nums,3);
        System.out.println(ans);
    }
    static int find(int[] nums,int k){
        int low = 1;
        int high = 0;
        for(int num:nums){
            high = Math.max(high,num);
        }
        int result = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canDis(nums,mid,k)){
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    static boolean canDis(int[] nums,int mid,int k){
        int count = 0;
        for(int candy:nums){
            count+=candy/mid;
        }
        return count>=k;
    }
}
