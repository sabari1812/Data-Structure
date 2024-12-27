package Array;

public class RerrangeSign {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int negativeIndex = 1;
        int postiveIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                result[postiveIndex] = nums[i];
                postiveIndex+=2;
            }
            else{
                result[negativeIndex] = nums[i];
                negativeIndex+=2;
            }
        }
        return result;
    }
}
