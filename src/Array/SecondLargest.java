package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10, 10};
        int ans = findSecondLargest(arr);
        System.out.println(ans);
    }
    static int findSecondLargest(int[] arr){
        int large = -1;
        int second_large = -1;
        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return  second_large;
    }
}
