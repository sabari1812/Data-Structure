package BinarySearch;

public class AllocateBooks {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        int ans  = findPages(arr,arr.length,2);
        System.out.println(ans);
    }
    static int findPages(int[] arr,int n,int m){
        int low = 0;
        int min = Integer.MAX_VALUE;
        int high = 0;
        for(int i=0;i<arr.length;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int student = canDo(arr,mid);
            if(student>m){

                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    static int canDo(int[] arr,int mid){
        int student = 1,pageStudent=0;
       for(int i=0;i<arr.length;i++){
           if(pageStudent+arr[i]<=mid){
               pageStudent+=arr[i];
           }else{
               student++;
               pageStudent = arr[i];
           }
       }
       return student;
    }
}
