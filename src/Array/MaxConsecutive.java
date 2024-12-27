package Array;

public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count=0;
            }else{
                count++;
                maxLen = Math.max(count,maxLen);
            }
        }
        return maxLen;
    }
}
