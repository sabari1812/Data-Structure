package Array;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count += arr[i];
            if(count>max){
                max= count;
            }
            if(count<0){
                count = 0;
            }
        }
        System.out.println(max);
    }
}
