package Array;

public class LargestElement{
    public static void main(String[] args) {
        int[] arr = {5,2,8};
        int ans  = findLargest(arr);
        System.out.println(ans);
    }
    static int findLargest(int[] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>res){
               res = arr[i];
           }
        }
        return res;
    }
}