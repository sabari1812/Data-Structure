package Array;

import java.util.Arrays;

public class Move_Zero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int nonZeroIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
