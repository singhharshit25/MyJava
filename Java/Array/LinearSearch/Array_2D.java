package Array.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target =18;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){
        for(int row =0;row<arr.length;row++){
            for(int col= 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
