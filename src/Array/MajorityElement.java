package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,6};
        int element = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element = nums[i];
                count++;
            }
            else if(element==nums[i]){
                count++;
            }
            else {
                count--;
            }
        }
        int result = 0;
        for(int i=0;i< nums.length;i++){
            if(element==nums[i]){
               result++;
            }
        }
        if(result>nums.length/2){
            System.out.println(element);
        }
       else{
            System.out.println(-1);
        }
    }
}
