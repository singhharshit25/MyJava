package Array.BinarySearch;

public class Order_Agnostic {
    public static void main(String[] args) {
        int arr[]= {2,4,6,9,11,12,14,20,36,48};
       //int arr[]= {40,36,20,14,8,6,2,1};

        int target = 36;
        int ans = search(arr, target);
        System.out.println("index at which target present is: "+ans);
    }
    public static int search(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        System.out.println(isAsc);

        while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]==target  ){
                    return mid;
                }
                if(isAsc){
                    if( target < arr[mid] ){ end = mid - 1; }      
                    else { start = mid + 1; }
                }
                else {
                    if( target > arr[mid] ){ end = mid - 1; }      
                     else { start = mid + 1; } 
                }
            }
            return -1;

        }
}

