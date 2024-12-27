package Array;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] price = {7, 6, 4, 3, 1};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            min = Math.min(min,price[i]);
            max = Math.max(max,price[i]-min);
        }
        System.out.println(max);
    }
    }
