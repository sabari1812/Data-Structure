package BinarySearch;

public class Bouqutes {
    public static void main(String[] args) {
        int[] nums = {1,10,3,10,2};
        int ans  = find(nums,3,1);
        System.out.println(ans);
    }
    static int find(int[] nums,int m,int k){
        int low = Integer.MAX_VALUE;
        int high = 0;
        int result = -1;
        for(int num:nums){
            low = Math.min(low,num);
            high = Math.max(high,num);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canDo(nums,mid,m,k)){
                result = mid;
                high = mid-1;

            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
    static boolean canDo(int[] nums,int mid,int m,int k){
      int boq = 0, flower = 0;
      for(int day:nums){
          if(day<=mid){
              flower++;
              if(flower==k){
                  boq++;
                  flower = 0;
              }
          }
      }
      return boq>=m;

    }
}
