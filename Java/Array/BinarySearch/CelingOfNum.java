package Array.BinarySearch;

public class CelingOfNum {
    public static void main(String[] args) {
        int arr[] ={2,3,5,9,14,16,18};
        int target =20;
        int ans = ceiling(arr,target);
       System.out.println(ans);
        //System.out.println(arr[start]);
    }

    public static int ceiling(int arr[],int target){
        int start = 0;
        int end =arr.length-1;
        int mid =0;
        //if taget > last elemet of array
        if(target>arr[arr.length-1]){return -1;}
        while(start<=end){
             mid = start +(end-start)/2;
            
             //if middle element == target
            if(arr[mid]==target){
                System.out.println(mid);
                return mid;
            }

            //if mid element < target 
            else if(arr[mid]<target){
                start =mid+1;
            }

            //if mid element > target
            else if(arr[mid]>target){
                end =mid-1;
            }
        }
        return start;
    }
}

