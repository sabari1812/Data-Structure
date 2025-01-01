package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},
                {1,1,0},
                {1,1,0},
                {1,0,1}};
        int n = arr.length;
        int m = arr[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];
        int[] delCol = {0,1,0,-1};
        int[] delRow = {-1,0,1,0};
        flood(arr,1,1,2,q,vis,delRow,delCol);
        for(int[] it:arr){
            System.out.println(Arrays.toString(it));
        }

    }
    //BFS
//    static int[][] flood(int[][] arr,int n,int m,int row,int col,int newColor){
//        int originalColor = arr[row][col];
//        if (originalColor == newColor) return arr;
//        Queue<Pair> q = new LinkedList<>();
//        q.offer(new Pair(row,col));
//        int[] delRow = {-1,0,1,0};
//        int[] delCol = {0,1,0,-1};
//        boolean[][] vis = new boolean[n][m];
//        vis[row][col] = true;
//        while(!q.isEmpty()){
//            Pair current = q.poll();
//            int r = current.row;
//            int c = current.col;
//            arr[r][c] = newColor;
//            for(int i=0;i<4;i++){
//                int nrow = r+delRow[i];
//                int ncol = c+delCol[i];
//                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && arr[nrow][ncol]== originalColor && !vis[nrow][ncol]){
//                    q.offer(new Pair(nrow,ncol));
//                    vis[nrow][ncol] = true;
//                }
//            }
//        }
//        return arr;
//    }
    static void flood(int arr[][],int row,int col,int newColor,Queue<Pair> q,boolean[][] vis,int[] delRow,int[] delCol){
        int originalColor = arr[row][col];
        int n = arr.length;
        int m = arr[0].length;
        arr[row][col] = newColor;
        for(int i=0;i<4;i++){
            int nrow = row+delRow[i];
            int ncol = col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && arr[nrow][ncol] == originalColor && !vis[nrow][ncol]){
                flood(arr,row,col,newColor,q,vis,delRow,delCol);
            }
        }
    }
}
