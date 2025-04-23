package Array.BinarySearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int arr[] ={2,3,5,9,14,16,18};
        int target =190;
        int ans = floor(arr,target);
        System.out.println(arr[ans]);
    }
    public static int floor(int arr[],int target){
       int start=0;
       int end = arr.length-1;
       int mid =0;
        while(start<=end){
            mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else if (arr[mid]>target){
                end = mid-1;
            }
        }
        return end;
    }
    
}
