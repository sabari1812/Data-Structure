package Array;

public class SingleNumber {
    int[] ans = new int[5];
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}
